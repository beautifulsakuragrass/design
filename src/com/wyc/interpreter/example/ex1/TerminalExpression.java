package com.wyc.interpreter.example.ex1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<>(16);

    TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
