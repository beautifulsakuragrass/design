package com.wyc.mediator.thought;

/**
 * 抽象同事类
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public void setMedium(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
