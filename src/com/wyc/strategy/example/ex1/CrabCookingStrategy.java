package com.wyc.strategy.example.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class CrabCookingStrategy implements ItemListener {

    private JFrame f;
    private JRadioButton qz, hs;
    private JPanel centerJP, southJP;
    /**
     * 厨房
     */
    private Kitchen cf;
    /**
     * 大闸蟹加工者
     */
    private CrabCooking qzx, hsx;

    private CrabCookingStrategy() {
        f = new JFrame("策略模式在大闸蟹做菜中的应用");
        f.setBounds(100, 100, 500, 400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        southJP = new JPanel();
        centerJP = new JPanel();
        f.add("South", southJP);
        f.add("Center", centerJP);
        qz = new JRadioButton("清蒸大闸蟹");
        hs = new JRadioButton("红烧大闸蟹");
        qz.addItemListener(this);
        hs.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(qz);
        group.add(hs);
        southJP.add(qz);
        southJP.add(hs);

        // 厨房
        cf = new Kitchen();
        //清蒸大闸蟹类
        qzx = new SteamedCrabs();
        //红烧大闸蟹类
        hsx = new BraisedCrabs();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton jc = (JRadioButton) e.getSource();
        if (jc == qz) {
            cf.setStrategy(qzx);
            cf.CookingMethod(); //清蒸
        } else if (jc == hs) {
            cf.setStrategy(hsx);
            cf.CookingMethod(); //红烧
        }
        centerJP.removeAll();
        centerJP.repaint();
        centerJP.add((Component) cf.getStrategy());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CrabCookingStrategy();
    }
}
