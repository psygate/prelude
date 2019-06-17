package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.operator;

import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.Hintable;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;

/**
 * Created by psygate on 26.04.2016.
 */
public class AndOperator extends BinaryOperator {

    @Override
    public boolean eval(PlayerDataCollection pdc) {
        return getLeft().eval(pdc) && getRight().eval(pdc);
    }

    @Override
    public String toString() {
        String out = "(";
        if (getLeft() != null) {
            out += getLeft() + " ";
        }
        out += "AND";
        if (getRight() != null) {
            out += " " + getRight();
        }
        return out + ")";
    }
}
