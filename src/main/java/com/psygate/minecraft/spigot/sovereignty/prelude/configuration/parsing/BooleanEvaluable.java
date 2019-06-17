package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing;

import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;

import java.util.Collection;
import java.util.List;

/**
 * Created by psygate on 26.04.2016.
 */
public interface BooleanEvaluable {
    boolean eval(PlayerDataCollection pdc);

    default boolean evalLocal(PlayerDataCollection pdc) {
        return eval(pdc);
    }

    List<String> getHints(PlayerDataCollection pdc);
}
