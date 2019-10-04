package com.wyc.observer.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ObserverPattern {

    public static void main(String[] args) {
        AbstractSubject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
