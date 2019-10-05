package com.wyc.memento.example.ex1;

/**
 * 发起人：您
 *
 * @author wyc
 * @date 2019/10/3
 */
public class You {
    /**
     * 妻子
     */
    private String wifeName;

    public void setWife(String name) {
        wifeName = name;
    }

    public String getWife() {
        return wifeName;
    }

    public Girl createMemento() {
        return new Girl(wifeName);
    }

    public void restoreMemento(Girl p) {
        setWife(p.getName());
    }
}
