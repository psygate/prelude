package com.psygate.minecraft.spigot.sovereignty.prelude.data;

/**
 * Created by psygate on 26.04.2016.
 */
public class MutableInt {
    private int value;

    public MutableInt() {
        value = 0;
    }

    public MutableInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void inc() {
        value++;
    }

    public void dec() {
        value--;
    }
}
