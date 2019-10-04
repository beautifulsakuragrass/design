package com.wyc.strategy.example.ex1;

import javax.swing.*;

/**
 * 具体策略类：清蒸大闸蟹
 *
 * @author wyc
 * @date 2019/10/3
 */
public class SteamedCrabs extends JLabel implements CrabCooking {

    private static final long serialVersionUID = 1L;

    @Override
    public void cookingMethod() {
        String path = "src/com/wyc/strategy/example/ex1/image/SteamedCrabs.jpg";
        this.setIcon(new ImageIcon(path));
        this.setHorizontalAlignment(CENTER);
    }
}
