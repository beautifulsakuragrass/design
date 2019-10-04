package com.wyc.template.thought;

/**
 * 含钩子方法的抽象类
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class AbstractHookClass {
    /**
     * 模板方法
     */
    public void templateMethod() {
        abstractMethod1();
        hookMethod1();
        if (hookMethod2()) {
            specificMethod();
        }
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    /**
     * 钩子方法1
     */
    public void hookMethod1() {
    }

    /**
     * 钩子方法2
     *
     * @return boolean
     */
    public boolean hookMethod2() {
        return true;
    }

    /**
     * 抽象方法1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法2
     */
    public abstract void abstractMethod2();
}
