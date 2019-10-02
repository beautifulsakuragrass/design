package com.wyc.decorator.example.ex1;

/**
 * 具体装饰角色：女妖
 *
 * @author wyc
 * @date 2019/10/2
 */
public class Succubus extends Changer {
    public Succubus(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger() {
        ((Original) super.m).setImage("Morrigan1.jpg");
    }
}
