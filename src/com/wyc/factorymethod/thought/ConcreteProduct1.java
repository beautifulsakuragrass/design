package com.wyc.factorymethod.thought;

/**
 * 具体产品1：实现抽象产品中的抽象方法
 *
 * @author wyc
 * @date 2019/8/27
 */
public class ConcreteProduct1 implements Product {

    /**
     * 商品展示
     */
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
