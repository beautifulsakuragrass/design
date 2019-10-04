package com.wyc.chainofresponsibility.thought;

/**
 * 具体处理者角色2
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteHandler2 extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if ("two".equals(request)) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
