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

import com.psygate.minecraft.spigot.sovereignty.nucleus.commands.util.CommandException;
import com.psygate.minecraft.spigot.sovereignty.nucleus.commands.util.NucleusCommand;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by psygate on 01.05.2016.
 */
public class ForceDedicationCommand extends NucleusCommand {
    public ForceDedicationCommand() {
        super(2, 2);
    }

    @Override
    protected void subOnCommand(CommandSender commandSender, Command command, String s, String[] strings) throws Exception {
        if (!commandSender.isOp()) {
            commandSender.sendMessage(ChatColor.RED + "This is an op only command.");
        } else {
            String name = strings[0];
            Player p = Bukkit.getPlayer(name);
            if (p == null) {
                commandSender.sendMessage(ChatColor.RED + name + " not found in players.");
                return;
            }

            boolean truefalse;

            try {
                truefalse = Boolean.parseBoolean(strings[1]);
            } catch (Exception e) {
                throw new CommandException(e.getMessage());
            }
            PlayerDataManager.getInstance().get(p.getUniqueId()).setOverridden(truefalse);
            PlayerDataManager.getInstance().flagPlayer(p);

            if (truefalse) {
                p.sendMessage(ChatColor.GREEN + "Prelude status set.");
                commandSender.sendMessage(ChatColor.GREEN + "Set prelude status on " + p.getName());
            } else {
                p.sendMessage(ChatColor.RED + "Prelude status revoked.");
                commandSender.sendMessage(ChatColor.GREEN + "Removed prelude status on " + p.getName());
            }
        }
    }

    @Override
    protected String[] getName() {
        return new String[]{"forcededicate"};
    }
}
