package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.actions;

/**
 * Created by psygate on 26.04.2016.
 */
public abstract class LongNumericAction extends Action {
    private long value;

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
