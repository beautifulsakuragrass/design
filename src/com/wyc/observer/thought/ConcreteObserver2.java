package com.wyc.observer.thought;

/**
 * 具体观察者1
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
