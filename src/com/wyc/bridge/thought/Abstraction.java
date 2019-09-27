package com.wyc.bridge.thought;

/**
 * 抽象化角色
 *
 * @author wyc
 * @date 2019/9/27
 */
public abstract class Abstraction {

    /**
     * 实现化角色
     */
    public Implementor imple;

    public Abstraction(Implementor imple) {
        this.imple = imple;
    }

    /**
     * 操作
     */
    public abstract void operation();
}
