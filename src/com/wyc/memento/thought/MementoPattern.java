package com.wyc.memento.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/4
 */
public class MementoPattern {

    public static void main(String[] args) {

        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        or.setState("S0");
        System.out.println("初始状态:" + or.getState());
        //保存状态
        cr.setMemento(or.createMemento());
        or.setState("S1");
        System.out.println("新的状态:" + or.getState());
        //恢复状态
        or.restoreMemento(cr.getMemento());
        System.out.println("恢复状态:" + or.getState());

    }
}
