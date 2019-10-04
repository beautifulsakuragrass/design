package com.wyc.observer.example.ex2;

import java.util.EventListener;

/**
 * 抽象观察者类：铃声事件监听器
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface BellEventListener extends EventListener {

    /**
     * 事件处理方法，听到铃声
     *
     * @param e RingEvent
     */
    public void heardBell(RingEvent e);
}
