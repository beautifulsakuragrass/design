package com.wyc.factorymethod.thought;

/**
 * 抽象工厂：提供了厂品的生成方法
 *
 * @author wyc
 * @date 2019/8/27
 */
public interface AbstractFactory {

    /**
     * 创建商品对象
     *
     * @return Product 商品对象
     */
    Product newProduct();
}
