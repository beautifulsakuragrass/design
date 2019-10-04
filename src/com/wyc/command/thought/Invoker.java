package com.wyc.command.thought;

/**
 * 调用者
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 调用执行
     */
    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
