package com.wyc.builder.example.ex1;

import javax.swing.*;
import java.awt.*;

/**
 * /产品：客厅
 *
 * @author wyc
 * @date 2019/9/10
 */
public class Parlour {

    /**
     * 墙
     */
    private String wall;
    /**
     * 电视
     */
    private String TV;
    /**
     * 沙发
     */
    private String sofa;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    /**
     * 展示
     */
    public void show() {
        JFrame jf = new JFrame("建造者模式测试");
        Container contentPane = jf.getContentPane();
        JPanel p = new JPanel();
        JScrollPane sp = new JScrollPane(p);
        String parlour = wall + TV + sofa;
        JLabel l = new JLabel(new ImageIcon("src/com/wyc/builder/example/ex1/meinv.jpeg"));
        p.setLayout(new GridLayout(1, 1));
        p.setBorder(BorderFactory.createTitledBorder("客厅"));
        p.add(l);
        contentPane.add(sp, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
