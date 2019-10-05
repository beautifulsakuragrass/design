package com.wyc.mediator.example.ex1;

/**
 * 抽象中介者：中介公司
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface Medium {
    /**
     * 客户注册
     *
     * @param member AbstractCustomer
     */
    void register(AbstractCustomer member);

    /**
     * 转发
     *
     * @param from String
     * @param ad   String
     */
    void relay(String from, String ad);
}
