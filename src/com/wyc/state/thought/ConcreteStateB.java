package com.wyc.state.thought;

/**
 * 具体状态B类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteStateB extends AbstractState {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
