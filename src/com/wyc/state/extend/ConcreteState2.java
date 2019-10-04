package com.wyc.state.extend;

/**
 * 具体状态2类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteState2 extends ShareState {
    @Override
    public void handle(ShareContext context) {
        System.out.println("当前状态是： 状态2");
        context.setState(context.getState("1"));
    }
}
