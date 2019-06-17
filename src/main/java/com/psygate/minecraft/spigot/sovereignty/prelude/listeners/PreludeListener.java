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

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

/**
 * Created by psygate on 29.04.2016.
 */
public class PreludeListener implements Listener {
    boolean isDedicated(Player player) {
        if (player.hasMetadata("dedication")
                && !player.getMetadata("dedication").isEmpty()
                && player.getMetadata("dedication").get(0).asBoolean() == true) {
            return true;
        } else {
            return false;
        }
    }
}
