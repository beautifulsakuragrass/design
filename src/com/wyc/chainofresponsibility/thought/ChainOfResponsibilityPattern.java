package com.wyc.chainofresponsibility.thought;

import java.util.logging.Handler;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        //组装责任链
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
