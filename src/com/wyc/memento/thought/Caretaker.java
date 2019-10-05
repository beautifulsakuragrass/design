package com.wyc.memento.thought;

/**
 * 管理者
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Caretaker {

    private Memento memento;

    public void setMemento(Memento m) {
        memento = m;
    }

    public Memento getMemento() {
        return memento;
    }
}
