package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.actions;

import com.psygate.minecraft.spigot.sovereignty.prelude.data.MutableInt;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;

/**
 * Created by psygate on 26.04.2016.
 */
public class BreakAction extends MaterialLongNumericAction {

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

    @Override
    public String toString() {
        return "BREAK{" +
                getMatcher() +
                " " + super.getValue() +
                '}';
    }

    public static long parse(String text) {
        return Long.parseLong(text);
    }
}
