package com.wyc.chainofresponsibility.example.ex1;

/**
 * 抽象处理者：领导类
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class AbstractLeader {

    private AbstractLeader next;

    public void setNext(AbstractLeader next) {
        this.next = next;
    }

    public AbstractLeader getNext() {
        return next;
    }

    /**
     * 处理请求的方法
     *
     * @param LeaveDays int
     */
    public abstract void handleRequest(int LeaveDays);

}
