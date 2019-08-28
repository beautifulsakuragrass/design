package com.wyc.factorymethod.thought;

/**
 * 具体工厂1：实现了厂品的生成方法
 *
 * @author wyc
 * @date 2019/8/27
 */
public class ConcreteFactory1 implements AbstractFactory {

    /**
     * 创建商品对象
     *
     * @return Product 商品对象
     */
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
