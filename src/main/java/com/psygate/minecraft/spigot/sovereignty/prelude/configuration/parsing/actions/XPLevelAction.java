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

package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.actions;

import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;

/**
 * Created by psygate on 26.04.2016.
 */
public class XPLevelAction extends XPAction {

    @Override
    public boolean eval(PlayerDataCollection pdc) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "GAINXP " + getValue() + " LEVELS";
    }

    public static long parse(String text) {
        return Long.parseLong(text);
    }
}
