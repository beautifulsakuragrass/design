package com.wyc.state.thought;

/**
 * 抽象状态类
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class AbstractState {
    /**
     * 状态
     *
     * @param context Context
     */
    public abstract void handle(Context context);
}
