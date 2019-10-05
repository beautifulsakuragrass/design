package com.wyc.interpreter.example.ex1;

/**
 * 抽象表达式类
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface Expression {
    /**
     * 解释
     *
     * @param info String
     * @return boolean
     */
    boolean interpret(String info);
}
