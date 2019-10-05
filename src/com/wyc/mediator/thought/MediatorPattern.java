package com.wyc.mediator.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class MediatorPattern {

    public static void main(String[] args) {
        AbstractMediator md = new ConcreteMediator();
        AbstractColleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
