package com.wyc.observer.thought;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class AbstractSubject {

    protected List<Observer> observers = new ArrayList<>(16);

    /**
     * 增加观察者方法
     *
     * @param observer Observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者方法
     *
     * @param observer
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}
