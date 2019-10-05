package com.wyc.mediator.extend;

/**
 * 具体同事类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class SimpleConcreteColleague1 implements SimpleColleague {

    SimpleConcreteColleague1() {
        SimpleMediator smd = SimpleMediator.getMedium();
        smd.register(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类1：收到请求。");
    }

    @Override
    public void send() {
        SimpleMediator smd = SimpleMediator.getMedium();
        System.out.println("具体同事类1：发出请求...");
        //请中介者转发
        smd.relay(this);
    }
}

