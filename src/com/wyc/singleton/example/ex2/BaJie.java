package com.wyc.singleton.example.ex2;

import javax.swing.*;

/**
 * 饿汉加载的单例模式
 *
 * @author wyc
 * @date 2019/8/24
 */
class BaJie extends JPanel {
    /**
     * BaJie实例
     */
    private static BaJie instance = new BaJie();

    /**
     * 私有的构造方法
     */
    private BaJie() {
        JLabel l1 = new JLabel(new ImageIcon("src/singleton/example/ex2/BaJie.jpg"));
        this.add(l1);
    }

    /**
     * 返回BaJie实例
     *
     * @return BaJie BaJie实例
     */
    static BaJie getInstance() {
        return instance;
    }
}
