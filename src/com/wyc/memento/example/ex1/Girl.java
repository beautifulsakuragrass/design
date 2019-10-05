package com.wyc.memento.example.ex1;

/**
 * 备忘录：美女
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Girl {
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
