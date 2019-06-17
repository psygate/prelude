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

import com.psygate.minecraft.spigot.sovereignty.prelude.data.MutableInt;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;

/**
 * Created by psygate on 28.04.2016.
 */
public class EatMaterialAction extends MaterialLongNumericAction {
    @Override
    public boolean eval(PlayerDataCollection pdc) {
        if (getMatcher().isMatchAll()) {
            return pdc.getBreakCount() >= getValue();
        } else {
            return pdc.getBreakMaterial()
                    .getOrDefault(getMatcher().getMaterial(), new MutableInt(0))
                    .getValue() >= getValue();
        }
    }

    public static long parse(String text) {
        return Long.parseLong(text);
    }
}
