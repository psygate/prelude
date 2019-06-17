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

import com.psygate.minecraft.spigot.sovereignty.prelude.Prelude;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

import java.util.UUID;

/**
 * Created by psygate on 28.04.2016.
 */
public class DedicatedFlag implements MetadataValue {
    private boolean isDedicated;
    private final UUID player;

    public DedicatedFlag(UUID player, boolean isDedicated) {
        this.player = player;
        this.isDedicated = isDedicated;
    }


    @Override
    public Object value() {
        return Boolean.valueOf(isDedicated);
    }

    @Override
    public int asInt() {
        return (isDedicated) ? 0 : -1;
    }

    @Override
    public float asFloat() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double asDouble() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long asLong() {
        return (isDedicated) ? 0 : -1;
    }

    @Override
    public short asShort() {
        return (short) ((isDedicated) ? 0 : -1);
    }

    @Override
    public byte asByte() {
        return (byte) ((isDedicated) ? 0 : -1);
    }

    @Override
    public boolean asBoolean() {
        return isDedicated;
    }

    @Override
    public String asString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Plugin getOwningPlugin() {
        return Prelude.getInstance();
    }

    @Override
    public void invalidate() {
        System.err.println("Dedicationd data invalidated, but method is not supported.");
    }
}
