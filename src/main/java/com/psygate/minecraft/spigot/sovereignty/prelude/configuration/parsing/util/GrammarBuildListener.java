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

package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.util;

import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.BooleanEvaluable;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.Hintable;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.MaterialMatcher;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.actions.*;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.operator.AndOperator;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.operator.BinaryOperator;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.operator.OrOperator;
import com.psygate.minecraft.spigot.sovereignty.prelude.grammar.PreludeBaseListener;
import com.psygate.minecraft.spigot.sovereignty.prelude.grammar.PreludeParser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.psygate.minecraft.spigot.sovereignty.prelude.grammar.PreludeLexer.*;

/**
 * Created by psygate on 28.04.2016.
 */
public class GrammarBuildListener extends PreludeBaseListener {
    private final static HashMap<String, LongNumericConverter> timeUnits = new HashMap<>();
    private final static HashMap<String, DoubleNumericConverter> metricUnits = new HashMap<>();

    static {
        timeUnits.put("HOUR", TimeUnit.HOURS::toMillis);
        timeUnits.put("HOURS", TimeUnit.HOURS::toMillis);
        timeUnits.put("H", TimeUnit.HOURS::toMillis);

        timeUnits.put("MINUTES", TimeUnit.MINUTES::toMillis);
        timeUnits.put("MINUTE", TimeUnit.MINUTES::toMillis);
        timeUnits.put("M", TimeUnit.MINUTES::toMillis);

        metricUnits.put("KILOMETER", (value) -> value * 1000);
        metricUnits.put("KILOMETERS", (value) -> value * 1000);
        metricUnits.put("KM", (value) -> value * 1000);

        metricUnits.put("METER", (value) -> value);
        metricUnits.put("METERS", (value) -> value);
        metricUnits.put("M", (value) -> value);

        Set<String> timekeys = new HashSet<>(timeUnits.keySet());
        for (String key : timekeys) {
            timeUnits.put(key.toLowerCase(), timeUnits.get(key));
        }

        Set<String> metrickeys = new HashSet<>(metricUnits.keySet());
        for (String key : metrickeys) {
            metricUnits.put(key.toLowerCase(), metricUnits.get(key));
        }
    }

    private final LinkedList<BooleanEvaluable> stack;

    public GrammarBuildListener(LinkedList<BooleanEvaluable> stack) {
        this.stack = stack;
    }

    @Override
    public void enterBreakblock(PreludeParser.BreakblockContext ctx) {
        stack.push(new BreakAction());
    }

    @Override
    public void exitBreakblock(PreludeParser.BreakblockContext ctx) {
        ((BreakAction) stack.peek()).setValue(BreakAction.parse(ctx.getToken(NUMBER, 0).getText()));
        ((BreakAction) stack.peek()).setMatcher(new MaterialMatcher(ctx.getToken(MATERIAL, 0).getText()));

    }

    @Override
    public void enterPlaceblock(PreludeParser.PlaceblockContext ctx) {
        stack.push(new PlaceAction());
    }

    @Override
    public void exitPlaceblock(PreludeParser.PlaceblockContext ctx) {
        ((PlaceAction) stack.peek()).setValue(PlaceAction.parse(ctx.getToken(NUMBER, 0).getText()));
        ((PlaceAction) stack.peek()).setMatcher(new MaterialMatcher(ctx.getToken(MATERIAL, 0).getText()));
    }

    @Override
    public void enterGainxp_level(PreludeParser.Gainxp_levelContext ctx) {
        stack.push(new XPLevelAction());
    }

    @Override
    public void exitGainxp_level(PreludeParser.Gainxp_levelContext ctx) {
        ((XPLevelAction) stack.peek()).setValue(XPLevelAction.parse(ctx.getToken(NUMBER, 0).getText()));
    }

    @Override
    public void enterGainxp_xp(PreludeParser.Gainxp_xpContext ctx) {
        stack.push(new XPXPAction());
    }

    @Override
    public void exitGainxp_xp(PreludeParser.Gainxp_xpContext ctx) {
        ((XPXPAction) stack.peek()).setValue(XPXPAction.parse(ctx.getToken(NUMBER, 0).getText()));
    }

    @Override
    public void enterOr(PreludeParser.OrContext ctx) {
        stack.push(new OrOperator());
    }

    @Override
    public void exitOr(PreludeParser.OrContext ctx) {
        handleBinary(OrOperator.class);
    }

    @Override
    public void enterEat_material(PreludeParser.Eat_materialContext ctx) {
        stack.push(new EatMaterialAction());
    }

    @Override
    public void exitEat_material(PreludeParser.Eat_materialContext ctx) {
        ((EatMaterialAction) stack.peek()).setValue(EatMaterialAction.parse(ctx.getToken(NUMBER, 0).getText()));
        ((EatMaterialAction) stack.peek()).setMatcher(new MaterialMatcher(ctx.getToken(MATERIAL, 0).getText()));
    }

    @Override
    public void enterEat_saturation(PreludeParser.Eat_saturationContext ctx) {
        stack.push(new EatSaturationAction());
    }

    @Override
    public void exitEat_saturation(PreludeParser.Eat_saturationContext ctx) {
        ((EatSaturationAction) stack.peek()).setValue(EatSaturationAction.parse(ctx.getToken(NUMBER, 0).getText()));
    }

    @Override
    public void enterWalk(PreludeParser.WalkContext ctx) {
        stack.push(new WalkAction());
    }

    @Override
    public void exitWalk(PreludeParser.WalkContext ctx) {
        double val = WalkAction.parse(ctx.getToken(NUMBER, 0).getText());
        val = metricUnits.get(ctx.getToken(METRIC_UNIT, 0).getText()).convert(val);
        ((WalkAction) stack.peek()).setValue(val);
    }

    @Override
    public void exitHelp_text(PreludeParser.Help_textContext ctx) {
        ((Hintable) stack.peek()).attachHint(ctx.STRING().getText().replaceAll("\"", ""));
    }

    private void handleBinary(Class<? extends BinaryOperator> operatorClass) {
        BooleanEvaluable right = stack.pop();
        BinaryOperator op = (BinaryOperator) stack.pop();
        BooleanEvaluable left = stack.pop();

        if (!operatorClass.isInstance(op)) {
            throw new IllegalStateException("Expected: " + operatorClass + " Actual: " + op.getClass());
        }
        op.setLeft(left);
        op.setRight(right);
        stack.push(op);
    }

    @Override
    public void enterAnd(PreludeParser.AndContext ctx) {
        stack.push(new AndOperator());
    }

    @Override
    public void exitAnd(PreludeParser.AndContext ctx) {
        handleBinary(AndOperator.class);
    }

    @Override
    public void enterPlay_time(PreludeParser.Play_timeContext ctx) {
        stack.push(new PlaytimeAction());
    }

    @Override
    public void exitPlay_time(PreludeParser.Play_timeContext ctx) {
        long val = Long.parseLong(ctx.getToken(NUMBER, 0).getText());
        val = timeUnits.get(ctx.getToken(TIME_UNIT, 0).getText()).convert(val);
        ((PlaytimeAction) stack.peek()).setValue(val);
    }


    @FunctionalInterface
    private interface LongNumericConverter {
        long convert(long value);
    }

    @FunctionalInterface
    private interface DoubleNumericConverter {
        double convert(double value);
    }
}
