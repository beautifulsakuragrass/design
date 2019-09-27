package com.wyc.bridge.thought;

/**
 * 扩展抽象化角色
 *
 * @author wyc
 * @date 2019/9/27
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * 构造方法
     *
     * @param imple Implementor
     */
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    /**
     * 操作
     */
    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.operationImpl();
    }
}
