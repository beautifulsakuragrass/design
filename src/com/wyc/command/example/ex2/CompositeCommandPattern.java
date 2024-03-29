package com.wyc.command.example.ex2;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class CompositeCommandPattern {

    public static void main(String[] args) {
        AbstractCommand cmd1 = new ConcreteCommand1();
        AbstractCommand cmd2 = new ConcreteCommand2();
        CompositeInvoker ir = new CompositeInvoker();
        ir.add(cmd1);
        ir.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        ir.execute();
    }
}
