package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.actions;

import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.BooleanEvaluable;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.Hintable;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by psygate on 26.04.2016.
 */
public abstract class Action extends Hintable implements BooleanEvaluable {
    @Override
    public List<String> getHints(PlayerDataCollection pdc) {
        if (!eval(pdc)) {
            return getHints();
        } else {
            return Collections.emptyList();
        }
    }

}
