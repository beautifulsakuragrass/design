package com.wyc.strategy.thought;

/**
 * 具体策略类A
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
