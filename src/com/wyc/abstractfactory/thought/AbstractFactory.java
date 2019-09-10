package com.wyc.abstractfactory.thought;

/**
 * 抽象工厂接口
 *
 * @author wyc
 * @date 2019/9/10
 */
public interface AbstractFactory {

    /**
     * @return Product1对象
     */
    Product1 newProduct1();

    /**
     * @return Product2 Product2对象
     */
    Product2 newProduct2();
}
