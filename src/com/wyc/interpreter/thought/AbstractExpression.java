package com.wyc.interpreter.thought;

/**
 * 抽象表达式类
 *
 * @author wyc
 * @date 2019/10/5
 */
public interface AbstractExpression {
    /**
     * 解释方法
     *
     * @param info String
     * @return Object
     */
    public Object interpret(String info);
}
