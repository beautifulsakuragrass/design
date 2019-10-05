package com.wyc.memento.extend;

/**
 * 原型管理者
 *
 * @author wyc
 * @date 2019/10/3
 */
public class PrototypeCaretaker {

    private OriginatorPrototype opt;

    public void setMemento(OriginatorPrototype opt) {
        this.opt = opt;
    }

    public OriginatorPrototype getMemento() {
        return opt;
    }
}
