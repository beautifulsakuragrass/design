package com.wyc.proxy.thought;

/**
 * 真实主题
 *
 * @author wyc
 * @date 2019/9/10
 */
public class RealSubject implements Subject {

    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
