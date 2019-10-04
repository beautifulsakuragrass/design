package com.wyc.composite.thought.security;

/**
 * 树叶构件
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
