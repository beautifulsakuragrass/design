package com.wyc.strategy.example.ex1;

/**
 * 环境类：厨房
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Kitchen {

    /**
     * 抽象策略
     */
    private CrabCooking strategy;

    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }

    public CrabCooking getStrategy() {
        return strategy;
    }

    public void CookingMethod() {
        //做菜
        strategy.cookingMethod();
    }
}
