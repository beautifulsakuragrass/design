package com.wyc.strategy.thought;

/**
 * 环境类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
