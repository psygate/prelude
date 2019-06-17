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

package com.psygate.minecraft.spigot.sovereignty.prelude.listeners;

import com.psygate.minecraft.spigot.sovereignty.amethyst.events.PlayerDamageReinforcementEvent;
import com.psygate.minecraft.spigot.sovereignty.ivory.groups.Rank;
import com.psygate.minecraft.spigot.sovereignty.ivory.managment.GroupManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

/**
 * Created by psygate on 29.04.2016.
 */
public class AmethystListener extends PreludeListener {
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onAmethystDamage(PlayerDamageReinforcementEvent ev) {
        try {
            if (!isDedicated(ev.getPlayer())
                    && !GroupManager.getInstance().getGroup(ev.getGroupID()).get()
                    .hasMemberWithRankGE(ev.getPlayer().getUniqueId(), Rank.MEMBER)) {
                ev.setCancelled(true);
            }
        } catch (Exception e) {
            ev.setCancelled(true);
        }
    }
}
