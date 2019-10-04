package com.wyc.chainofresponsibility.thought;

/**
 * 抽象处理者角色
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class AbstractHandler {
    private AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public AbstractHandler getNext() {
        return next;
    }

    /**
     * 处理请求的方法
     *
     * @param request String
     */
    public abstract void handleRequest(String request);
}
