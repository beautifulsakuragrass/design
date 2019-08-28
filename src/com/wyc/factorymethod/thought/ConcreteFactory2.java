package com.wyc.factorymethod.thought;

/**
 * 具体工厂2：实现了厂品的生成方法
 *
 * @author wyc
 * @date 2019/8/27
 */
public class ConcreteFactory2 implements AbstractFactory {

    /**
     * 创建商品对象
     *
     * @return Product 商品对象
     */
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();

    }
}
