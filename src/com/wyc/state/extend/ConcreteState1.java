package com.wyc.state.extend;

/**
 * 具体状态1类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteState1 extends ShareState {
    @Override
    public void handle(ShareContext context) {
        System.out.println("当前状态是： 状态1");
        context.setState(context.getState("2"));
    }
}
