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

package com.psygate.minecraft.spigot.sovereignty.prelude.commands;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.psygate.minecraft.spigot.sovereignty.nucleus.commands.util.NucleusPlayerCommand;
import com.psygate.minecraft.spigot.sovereignty.prelude.Prelude;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by psygate on 27.05.2016.
 */
public class InfoCommand extends NucleusPlayerCommand {
    private final static Random rand = new Random();

    private final static LoadingCache<UUID, String> helptextcache = CacheBuilder.newBuilder()
            .expireAfterWrite(30, TimeUnit.MINUTES)
            .expireAfterAccess(30, TimeUnit.MINUTES)
            .initialCapacity(100)
            .maximumSize(1000)
            .build(new CacheLoader<UUID, String>() {
                @Override
                public String load(UUID uuid) throws Exception {
                    List<String> strings = Prelude.getConf().buildHelpText(PlayerDataManager.getInstance().get(uuid));
                    if (strings.isEmpty()) {
                        return "";
                    }
                    return strings.get(rand.nextInt(strings.size()));
                }
            });

    public InfoCommand() {
        super(0, 0);
    }

    @Override
    protected String[] getName() {
        return new String[]{"preludeinfo"};
    }

    @Override
    protected void subOnCommand(Player player, Command command, String s, String[] strings) throws Exception {
        if (PlayerDataManager.getInstance().checkPreludeStatus(player)) {
            player.sendMessage(ChatColor.GREEN + "All prelude requirements passed.");
            PlayerDataManager.getInstance().flagPlayer(player);
        } else {
            player.sendMessage(ChatColor.RED + "Prelude requirements missing.");
            String text = helptextcache.get(player.getUniqueId());
            if (text != null && !text.isEmpty()) {
                player.sendMessage(text);
            } else {
                player.sendMessage(ChatColor.RED + "No hints available.");
            }
        }
    }
}
