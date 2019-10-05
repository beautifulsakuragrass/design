package com.wyc.mediator.extend;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class SimpleMediatorPattern {

    public static void main(String[] args) {
        SimpleColleague c1, c2;
        c1 = new SimpleConcreteColleague1();
        c2 = new SimpleConcreteColleague2();
        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}
