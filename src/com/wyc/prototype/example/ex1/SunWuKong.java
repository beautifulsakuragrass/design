package com.wyc.prototype.example.ex1;

import javax.swing.*;

/**
 * 原型对象
 *
 * @author wyc
 * @date 2019/8/24
 */
public class SunWuKong extends JPanel implements Cloneable {

    /**
     * UUID
     */
    private static final long serialVersionUID = 5543049531872119328L;

    /**
     * 构造方法
     */
    SunWuKong() {
        JLabel ll = new JLabel(new ImageIcon("src/com/wyc/prototype/example/ex1/SunWuKong.jpg"));
        this.add(ll);
    }

    /**
     * 克隆方法
     *
     * @return Object 克隆的对象
     */
    @Override
    public Object clone() {
        SunWuKong sunWuKong = null;
        try {
            sunWuKong = (SunWuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝悟空失败!");
        }
        return sunWuKong;
    }
}

