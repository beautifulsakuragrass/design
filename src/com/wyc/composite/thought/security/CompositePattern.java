package com.wyc.composite.thought.security;

import com.wyc.flyweight.example.ex1.ChessPieces;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class CompositePattern {
    public static void main(String[] args) {

        // 树枝节点
        Composite c0 = new Composite();
        Composite c1 = new Composite();
        // 叶子节点
        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");

        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
