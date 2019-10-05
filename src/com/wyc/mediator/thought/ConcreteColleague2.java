package com.wyc.mediator.thought;

/**
 * 具体同事类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteColleague2 extends AbstractColleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        //请中介者转发
        mediator.relay(this);
    }
}
