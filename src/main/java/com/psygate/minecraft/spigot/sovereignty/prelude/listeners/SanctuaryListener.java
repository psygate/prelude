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

import com.psygate.minecraft.spigot.sovereignty.sanctuary.events.SanctuaryDamageEvent;
import com.psygate.minecraft.spigot.sovereignty.sanctuary.events.SanctuaryPVPEvent;
import com.psygate.minecraft.spigot.sovereignty.sanctuary.events.SanctuaryPotionThrowEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

/**
 * Created by psygate on 29.04.2016.
 */
public class SanctuaryListener extends PreludeListener {
    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onSanctuaryDamage(SanctuaryDamageEvent ev) {
        if (!isDedicated(ev.getPlayer())) {
            ev.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onSanctuaryPVP(SanctuaryPVPEvent ev) {
        if (!isDedicated(ev.getAttacker()) && !ev.isAttackerIsMember()) {
            ev.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onSanctuaryPotionThrow(SanctuaryPotionThrowEvent ev) {
        if (!isDedicated(ev.getSource()) && !ev.isSourceIsMember()) {
            ev.setCancelled(true);
        }
    }
}
