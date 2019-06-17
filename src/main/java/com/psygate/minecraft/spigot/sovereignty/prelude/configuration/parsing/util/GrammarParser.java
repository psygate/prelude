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
import com.psygate.minecraft.spigot.sovereignty.prelude.grammar.PreludeLexer;
import com.psygate.minecraft.spigot.sovereignty.prelude.grammar.PreludeParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.Locale;

/**
 * Created by psygate on 28.04.2016.
 */
public class GrammarParser {
    private final String data;

    public GrammarParser(String data) {
        this.data = data;
    }

    public GrammarParser(File file) {
        try (FileInputStream in = new FileInputStream(file)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int read;

            while ((read = in.read()) != -1) {
                out.write(read);
            }

            data = new String(out.toByteArray(), Charset.forName("UTF-8"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public BooleanEvaluable parse() {
        LinkedList<BooleanEvaluable> stack = new LinkedList<>();
//        String process = data.toUpperCase(Locale.ENGLISH);
        String process = data;
        ANTLRInputStream fs = new ANTLRInputStream(process);
        PreludeLexer dl = new PreludeLexer(fs);
        PreludeParser dp = new PreludeParser(new BufferedTokenStream(dl));

        dp.setErrorHandler(new DefaultErrorStrategy() {
            @Override
            public void reportError(Parser recognizer, RecognitionException e) {
                super.reportError(recognizer, e);
                throw new IllegalStateException("Grammar error.");
            }
        });

        PreludeParser.ParseContext parsecontext = dp.parse();

        GrammarBuildListener buildlistener = new GrammarBuildListener(stack);
        ParseTreeWalker.DEFAULT.walk(buildlistener, parsecontext);

        assert stack.size() == 1;

        return stack.pop();
    }
}
