package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.operator;

import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.BooleanEvaluable;
import com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing.Hintable;
import com.psygate.minecraft.spigot.sovereignty.prelude.data.PlayerDataCollection;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by psygate on 26.04.2016.
 */
public abstract class BinaryOperator extends Hintable implements BooleanEvaluable {
    private BooleanEvaluable left, right;

    public BooleanEvaluable getLeft() {
        return left;
    }

    public void setLeft(BooleanEvaluable left) {
        this.left = left;
    }

    public BooleanEvaluable getRight() {
        return right;
    }

    public void setRight(BooleanEvaluable right) {
        this.right = right;
    }

    @Override
    public List<String> getHints(PlayerDataCollection pdc) {
        LinkedList<String> hints = new LinkedList<>();
        hints.addAll(left.getHints(pdc));
        hints.addAll(right.getHints(pdc));
        return hints;
    }

    @Override
    public String toString() {
        return "BinaryOperator{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
