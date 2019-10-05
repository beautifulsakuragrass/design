package com.wyc.interpreter.thought;

/**
 * 终结符表达式类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class TerminalExpression implements AbstractExpression {
    /**
     * 表达式转换
     *
     * @param info String
     * @return Object
     */
    @Override
    public Object interpret(String info) {
        //对终结符表达式的处理
        return null;
    }
}
