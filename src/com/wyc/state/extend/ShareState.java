package com.wyc.state.extend;

/**
 * 抽象状态类
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class ShareState {
    /**
     * 共享
     *
     * @param context ShareContext
     */
    public abstract void handle(ShareContext context);
}
