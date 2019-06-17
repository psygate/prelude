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

package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing;

import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by psygate on 28.05.2016.
 */
public abstract class Hintable implements BooleanEvaluable {
    private List<String> hints = new LinkedList<>();

    public void attachHint(String hint) {
        hints.add(hint);
    }


    public List<String> getHints() {
        return hints;
    }

    public void attachHints(List<String> hints) {
        this.hints.addAll(hints);
    }

    private void evalHints(LinkedList<String> hints, PlayerDataCollection col) {
        if (!evalLocal(col)) {
            hints.addAll(this.hints);
        }
    }
}
