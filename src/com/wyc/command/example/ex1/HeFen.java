package com.wyc.command.example.ex1;

/**
 * 具体命令：河粉
 *
 * @author wyc
 * @date 2019/10/3
 */
public class HeFen implements Breakfast {

    private HeFenChef receiver;

    HeFen() {
        receiver = new HeFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
