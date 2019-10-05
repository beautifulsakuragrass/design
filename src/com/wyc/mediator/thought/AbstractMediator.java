package com.wyc.mediator.thought;

/**
 * 抽象中介者
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class AbstractMediator {
    /**
     * @param colleague AbstractColleague
     */
    public abstract void register(AbstractColleague colleague);

    /**
     * 转发
     *
     * @param cl AbstractColleague
     */
    public abstract void relay(AbstractColleague cl);
}
