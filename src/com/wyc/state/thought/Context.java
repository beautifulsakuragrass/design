package com.wyc.state.thought;

/**
 * 环境类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Context {

    private AbstractState state;

    /**
     * 定义环境类的初始状态
     */
    public Context() {
        this.state = new ConcreteStateA();
    }

    /**
     * 设置新状态
     *
     * @param state AbstractState
     */
    public void setState(AbstractState state) {
        this.state = state;
    }

    /**
     * 读取状态
     *
     * @return AbstractState
     */
    public AbstractState getState() {
        return (state);
    }

    /**
     * 对请求做处理
     */
    public void handle() {
        state.handle(this);
    }
}
