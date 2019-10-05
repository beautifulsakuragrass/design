package com.wyc.memento.extend;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class PrototypeMemento {
    public static void main(String[] args) {
        OriginatorPrototype or = new OriginatorPrototype();
        PrototypeCaretaker cr = new PrototypeCaretaker();
        or.setState("wyc");
        System.out.println("初始状态 :" + or.getState());
        //保存状态
        cr.setMemento(or.createMemento());
        or.setState("zq");
        System.out.println("新的状态 :" + or.getState());
        //恢复状态
        or.restoreMemento(cr.getMemento());
        System.out.println("恢复状态 :" + or.getState());
    }
}
