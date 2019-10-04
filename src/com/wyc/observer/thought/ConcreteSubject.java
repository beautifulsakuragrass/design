package com.wyc.observer.thought;

/**
 * 具体目标
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteSubject extends AbstractSubject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for (Object obs : observers) {
            ((Observer) obs).response();
        }

    }
}
