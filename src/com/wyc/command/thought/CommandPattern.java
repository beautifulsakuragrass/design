package com.wyc.command.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class CommandPattern {

    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
