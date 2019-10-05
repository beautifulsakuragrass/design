package com.wyc.interpreter.extend;

import com.singularsys.jep.*;

/**
 * 客户端程序
 * 存款利息的计算公式是：本金x利率x时间=利息
 *
 * @author wyc
 * @date 2019/10/3
 */
public class JepDemo {
    public static void main(String[] args) throws JepException {
        Jep jep = new Jep();
        //定义要计算的数据表达式
        String interestOnDeposit = "本金*利率*时间";
        //给相关变量赋值
        jep.addVariable("本金", 10000);
        jep.addVariable("利率", 0.038);
        jep.addVariable("时间", 2);
        //解析表达式
        jep.parse(interestOnDeposit);
        //计算
        Object accrual = jep.evaluate();
        System.out.println("存款利息：" + accrual);
    }
}
