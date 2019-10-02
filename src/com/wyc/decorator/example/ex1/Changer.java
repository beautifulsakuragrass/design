package com.wyc.decorator.example.ex1;

/**
 * 抽象装饰角色：变形
 *
 * @author wyc
 * @date 2019/10/2
 */
public class Changer implements Morrigan {

    Morrigan m;

    public Changer(Morrigan m) {
        this.m = m;
    }

    @Override
    public void display() {
        m.display();
    }
}
