package com.wyc.strategy.thought;

/**
 * 具体策略类B
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
