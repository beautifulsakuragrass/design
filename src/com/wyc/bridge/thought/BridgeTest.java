package com.wyc.bridge.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/9/27
 */
public class BridgeTest {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
