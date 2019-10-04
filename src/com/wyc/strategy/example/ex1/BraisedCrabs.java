package com.wyc.strategy.example.ex1;

import javax.swing.*;

/**
 * 具体策略类：红烧大闸蟹
 *
 * @author wyc
 * @date 2019/10/3
 */
public class BraisedCrabs extends JLabel implements CrabCooking {

    private static final long serialVersionUID = 1L;

    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/com/wyc/strategy/example/ex1/image/BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
