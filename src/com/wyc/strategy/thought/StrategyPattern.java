package com.wyc.strategy.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class StrategyPattern {

    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
