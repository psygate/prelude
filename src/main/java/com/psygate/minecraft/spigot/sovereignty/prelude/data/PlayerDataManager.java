/*
 *     Copyright (C) 2016 psygate (https://github.com/psygate)
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 */

package com.psygate.minecraft.spigot.sovereignty.prelude.data;

import com.google.common.cache.*;
import com.psygate.minecraft.spigot.sovereignty.prelude.Prelude;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.Tables;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records.PreludeBrokenMaterialsRecord;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records.PreludeEatenMaterialsRecord;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records.PreludePlacedMaterialsRecord;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records.PreludePlayerDataRecord;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static com.psygate.minecraft.spigot.sovereignty.prelude.db.model.Tables.*;

/**
 * Created by psygate on 28.05.2016.
 */
public class PlayerDataManager {
    private static PlayerDataManager instance;

    private PlayerDataManager() {
    }

    public static PlayerDataManager getInstance() {
        if (instance == null) {
            instance = new PlayerDataManager();
        }

        return instance;
    }

    private LoadingCache<UUID, PlayerDataCollection> map = CacheBuilder.newBuilder()
            .expireAfterAccess(10, TimeUnit.MINUTES)
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .initialCapacity(20)
            .maximumSize(1000)
            .removalListener(new RemovalListener<UUID, PlayerDataCollection>() {
                @Override
                public void onRemoval(RemovalNotification<UUID, PlayerDataCollection> removalNotification) {
                    if (removalNotification.getValue() == null) {
                        return;
                    }
                    Prelude.DBI().asyncSubmit((conf) -> {
                        DSLContext ctx = DSL.using(conf);
                        PreludePlayerDataRecord rec = new PreludePlayerDataRecord(
                                removalNotification.getKey(),
                                removalNotification.getValue().getBreakCount(),
                                removalNotification.getValue().getPlaceCount(),
                                removalNotification.getValue().getMetersWalked(),
                                removalNotification.getValue().getXpGained(),
                                removalNotification.getValue().getSaturationGained(),
                                removalNotification.getValue().getMillisecondsPlayed(),
                                removalNotification.getValue().getPlaytimeTrackingMonth(),
                                false
                        );

                        ctx.insertInto(Tables.PRELUDE_PLAYER_DATA)
                                .set(rec)
                                .onDuplicateKeyUpdate()
                                .set(rec)
                                .execute();


                        removalNotification.getValue().getPlaceMaterial()
                                .entrySet()
                                .stream()
                                .forEach(entry -> {
                                            PreludePlacedMaterialsRecord lrec = new PreludePlacedMaterialsRecord(
                                                    removalNotification.getKey(),
                                                    entry.getKey(),
                                                    entry.getValue().getValue()
                                            );

                                            ctx.insertInto(PRELUDE_PLACED_MATERIALS)
                                                    .set(lrec)
                                                    .onDuplicateKeyUpdate()
                                                    .set(lrec)
                                                    .execute();
                                        }
                                );

                        removalNotification.getValue().getBreakMaterial()
                                .entrySet()
                                .stream()
                                .forEach(entry -> {
                                            PreludeBrokenMaterialsRecord lrec = new PreludeBrokenMaterialsRecord(
                                                    removalNotification.getKey(),
                                                    entry.getKey(),
                                                    entry.getValue().getValue()
                                            );

                                            ctx.insertInto(PRELUDE_BROKEN_MATERIALS)
                                                    .set(lrec)
                                                    .onDuplicateKeyUpdate()
                                                    .set(lrec)
                                                    .execute();
                                        }
                                );

                        removalNotification.getValue().getMaterialsEaten()
                                .entrySet()
                                .stream()
                                .forEach(entry -> {
                                            PreludeEatenMaterialsRecord lrec = new PreludeEatenMaterialsRecord(
                                                    removalNotification.getKey(),
                                                    entry.getKey(),
                                                    entry.getValue().getValue()
                                            );

                                            ctx.insertInto(PRELUDE_EATEN_MATERIALS)
                                                    .set(lrec)
                                                    .onDuplicateKeyUpdate()
                                                    .set(lrec)
                                                    .execute();
                                        }
                                );
                    });
                }
            })
            .build(new CacheLoader<UUID, PlayerDataCollection>() {
                @Override
                public PlayerDataCollection load(UUID uuid) throws Exception {
                    return Prelude.DBI().submit((conf) -> {
                        DSLContext ctx = DSL.using(conf);
                        PlayerDataCollection col = ctx.selectFrom(Tables.PRELUDE_PLAYER_DATA)
                                .where(Tables.PRELUDE_PLAYER_DATA.PUUID.eq(uuid))
                                .fetchOptional()
                                .map(PlayerDataCollection::new)
                                .orElseGet(() -> new PlayerDataCollection(uuid));

                        HashMap<Material, MutableInt> placed = new HashMap<>();
                        HashMap<Material, MutableInt> broken = new HashMap<>();
                        HashMap<Material, MutableInt> eaten = new HashMap<>();

                        ctx.selectFrom(PRELUDE_PLACED_MATERIALS)
                                .where(PRELUDE_PLACED_MATERIALS.PUUID.eq(uuid))
                                .fetch()
                                .forEach(r -> placed.put(r.getPlacedMaterial(), new MutableInt(r.getAmount())));

                        ctx.selectFrom(PRELUDE_BROKEN_MATERIALS)
                                .where(PRELUDE_BROKEN_MATERIALS.PUUID.eq(uuid))
                                .fetch()
                                .forEach(r -> broken.put(r.getBrokenMaterial(), new MutableInt(r.getAmount())));

                        ctx.selectFrom(PRELUDE_EATEN_MATERIALS)
                                .where(PRELUDE_EATEN_MATERIALS.PUUID.eq(uuid))
                                .fetch()
                                .forEach(r -> eaten.put(r.getEatenMaterial(), new MutableInt(r.getAmount())));

                        col.setPlaceMaterial(placed);
                        col.setBreakMaterial(broken);
                        col.setMaterialsEaten(eaten);
                        return col;
                    });
                }
            });


    public PlayerDataCollection get(UUID uuid) {
        return map.getUnchecked(uuid);
    }

    public boolean checkPreludeStatus(Player player) {
        PlayerDataCollection col = PlayerDataManager.getInstance().get(player.getUniqueId());
        if (col.isOverridden() || player.isOp()) {
            return true;
        }

        return Prelude.getConf().checkDedication(col);
    }

    public void flagPlayer(Player player) {
        if (checkPreludeStatus(player)) {
            player.setMetadata("dedication", new DedicatedFlag(player.getUniqueId(), true));
        } else {
            player.setMetadata("dedication", new DedicatedFlag(player.getUniqueId(), false));
        }
    }

    public void flush() {
        map.invalidateAll();
    }
}
