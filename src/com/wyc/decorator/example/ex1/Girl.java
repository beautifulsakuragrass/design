package com.wyc.decorator.example.ex1;

/**
 * 具体装饰角色：少女
 *
 * @author wyc
 * @date 2019/10/2
 */
public class Girl extends Changer {
    public Girl(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((Original) super.m).setImage("Morrigan2.jpg");
    }
}
