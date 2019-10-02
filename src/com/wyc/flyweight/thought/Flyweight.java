package com.wyc.flyweight.thought;

/**
 * 抽象享元角色
 *
 * @author wyc
 * @date 2019/10/2
 */
public interface Flyweight {

    /**
     * 非享元角色注入
     * @param state
     */
    public void operation(UnsharedConcreteFlyweight state);
}
