package com.wyc.command.example.ex2;

/**
 * 树叶构件: 具体命令1
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteCommand1 implements  AbstractCommand{

    private CompositeReceiver receiver;

    ConcreteCommand1() {
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action1();
    }

}
