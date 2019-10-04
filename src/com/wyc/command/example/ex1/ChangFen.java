package com.wyc.command.example.ex1;

/**
 * 具体命令：肠粉
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ChangFen implements Breakfast {

    private ChangFenChef receiver;

    ChangFen() {
        receiver = new ChangFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
