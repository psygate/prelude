package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.actions;

import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.MaterialMatcher;

/**
 * Created by psygate on 26.04.2016.
 */
public abstract class MaterialLongNumericAction extends LongNumericAction {
    private MaterialMatcher matcher;

    public MaterialMatcher getMatcher() {
        return matcher;
    }

    public void setMatcher(MaterialMatcher matcher) {
        this.matcher = matcher;
    }
}
