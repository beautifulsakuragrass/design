package com.wyc.abstractfactory.example.ex1;

import javax.swing.*;
import java.awt.*;

/**
 * 具体产品：马类
 *
 * @author wyc
 * @date 2019/9/10
 */
public class Horse implements Animal {

    private JFrame jf = new JFrame("抽象工厂模式测试");

    public Horse() {
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("动物：马"));
        JScrollPane sp = new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon("src/com/wyc/abstractfactory/example/ex1/A_Horse.jpg"));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * 展示
     */
    @Override
    public void show() {
        jf.setVisible(true);
    }
}
