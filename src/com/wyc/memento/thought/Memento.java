package com.wyc.memento.thought;

/**
 * 备忘录
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
