package com.wyc.proxy.example.ex1;

import javax.swing.*;
import java.awt.*;

/**
 * 真实主题：婺源特产
 *
 * @author wyc
 * @date 2019/9/10
 */
public class WySpecialty extends JFrame implements Specialty {

    private static final long serialVersionUID = 1L;

    public WySpecialty() {
        super("韶关代理婺源特产测试");
        this.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel(new ImageIcon("src/com/wyc/proxy/example/ex1/WuyuanSpecialty.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void display() {
        this.setVisible(true);
    }
}
