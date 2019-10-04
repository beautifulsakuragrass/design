package com.wyc.state.thought;

/**
 * 具体状态A类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteStateA extends AbstractState {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
