package com.wyc.bridge.thought;

/**
 * 具体实现化角色
 *
 * @author wyc
 * @date 2019/9/27
 */
public class ConcreteImplementorA implements Implementor {

    /**
     * 操作
     */
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
