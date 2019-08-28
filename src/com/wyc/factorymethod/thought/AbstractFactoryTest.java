package com.wyc.factorymethod.thought;

import java.util.Objects;

/**
 * 测试类
 *
 * @author wyc
 * @date 2019/8/27
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXml.getObject();
            a = Objects.requireNonNull(af).newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
