package com.wyc.composite.example.ex1;

import java.util.ArrayList;

/**
 * 树枝构件：袋子
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Bags implements Articles {
    /**
     * 名字
     */
    private String name;

    private ArrayList<Articles> bags = new ArrayList<>(16);

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}
