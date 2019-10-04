package com.wyc.command.example.ex2;

/**
 * 树叶构件: 具体命令2
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteCommand2 implements AbstractCommand {
    private CompositeReceiver receiver;

    ConcreteCommand2() {
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
