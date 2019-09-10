package com.wyc.abstractfactory.thought;

/**
 * 混凝土厂1
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ConcreteFactory1 implements AbstractFactory {
    /**
     * @return Product1对象
     */
    @Override
    public Product1 newProduct1() {
        return null;
    }

    /**
     * @return Product2对象
     */
    @Override
    public Product2 newProduct2() {
        return null;
    }
}
