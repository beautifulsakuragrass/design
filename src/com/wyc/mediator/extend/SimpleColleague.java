package com.wyc.mediator.extend;

/**
 * 抽象同事类
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface SimpleColleague {

    /**
     * 接收
     */
    void receive();

    /**
     * 发送
     */
    void send();
}
