package com.wyc.observer.example.ex1;

/**
 * 抽象观察者：公司
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface Company {

    /**
     * 作出反应
     *
     * @param number int
     */
    void response(int number);
}
