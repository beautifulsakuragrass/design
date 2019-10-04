package com.wyc.state.example.ex2;

/**
 * 具体状态类：死亡状态
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Dead extends ThreadState {
    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
