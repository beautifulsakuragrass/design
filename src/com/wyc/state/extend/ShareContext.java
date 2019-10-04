package com.wyc.state.extend;

import java.util.HashMap;

/**
 * 环境类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ShareContext {
    private ShareState state;
    private HashMap<String, ShareState> stateSet = new HashMap<>(16);

    public ShareContext() {
        state = new ConcreteState1();
        stateSet.put("1", state);
        state = new ConcreteState2();
        stateSet.put("2", state);
        state = getState("1");
    }

    /**
     * 设置新状态
     *
     * @param state ShareState
     */
    public void setState(ShareState state) {
        this.state = state;
    }

    /**
     * 读取状态
     *
     * @param key String
     * @return ShareState
     */
    public ShareState getState(String key) {
        ShareState s = (ShareState) stateSet.get(key);
        return s;
    }

    /**
     * 对请求做处理
     */
    public void Handle() {
        state.handle(this);
    }
}
