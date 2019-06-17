package com.psygate.minecraft.spigot.sovereignty.prelude.listeners;

import com.psygate.minecraft.spigot.sovereignty.prelude.Prelude;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.Edible;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by psygate on 27.04.2016.
 */
public class PlayerDataListener implements Listener {
    private Map<UUID, Long> joinTimeMap = new HashMap<>();

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerJoin(PlayerJoinEvent ev) {
        addToJoinMap(ev.getPlayer().getUniqueId());
        checkPrelude(ev.getPlayer());
    }

    private void checkPrelude(Player player) {
        PlayerDataManager.getInstance().flagPlayer(player);
        if (PlayerDataManager.getInstance().checkPreludeStatus(player)) {
            player.sendMessage(Prelude.getConf().getDedicatedMessage());
        } else {
            player.sendMessage(Prelude.getConf().getUndedicatedMessage());
        }
    }

    public void addToJoinMap(UUID uniqueId) {
        joinTimeMap.put(uniqueId, System.currentTimeMillis());
    }


    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerQuit(PlayerJoinEvent ev) {
        quitPlayer(ev.getPlayer().getUniqueId());
    }

    public void quitPlayer(UUID uniqueId) {
        long curtime = System.currentTimeMillis();
        long played = curtime - joinTimeMap.getOrDefault(uniqueId, curtime);
        PlayerDataManager.getInstance().get(uniqueId).incMillisecondsPlayed(played);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onBlockBreak(BlockBreakEvent ev) {
        PlayerDataCollection collection = PlayerDataManager.getInstance().get(ev.getPlayer().getUniqueId());
        collection.incBlockBreak();
        collection.addBrokenMaterial(ev.getBlock().getType());
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onBlockPlace(BlockPlaceEvent ev) {
        PlayerDataCollection collection = PlayerDataManager.getInstance().get(ev.getPlayer().getUniqueId());
        collection.incBlockPlace();
        collection.addPlacedMaterial(ev.getBlock().getType());
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent ev) {
        PlayerDataManager.getInstance().get(ev.getPlayer().getUniqueId()).incPlayerMove(ev.getFrom().distance(ev.getTo()));
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerEat(PlayerItemConsumeEvent ev) {
        if (ev.getItem().getType().isEdible() && Edible.has(ev.getItem().getType())) {
            Edible ed = Edible.get(ev.getItem().getType());
            PlayerDataCollection col = PlayerDataManager.getInstance().get(ev.getPlayer().getUniqueId());
            col.incSaturationGained(ed.getFoodPoints());
            col.addEatenMaterial(ev.getItem().getType());
        }
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerXPPickup(PlayerExpChangeEvent ev) {
        PlayerDataManager.getInstance().get(ev.getPlayer().getUniqueId()).incXPGained(ev.getAmount());
    }
}
