package com.wyc.decorator.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/2s
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
