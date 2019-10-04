package com.wyc.command.example.ex1;

/**
 * 具体命令：馄饨
 *
 * @author wyc
 * @date 2019/10/3
 */
public class HunTun implements Breakfast {
    private HunTunChef receiver;

    HunTun() {
        receiver = new HunTunChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
