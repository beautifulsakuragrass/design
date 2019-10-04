package com.wyc.command.example.ex1;

import javax.swing.*;

/**
 * 接收者：馄饨厨师
 *
 * @author wyc
 * @date 2019/10/3
 */
public class HunTunChef extends JFrame {

    private static final long serialVersionUID = 1L;
    JLabel l = new JLabel();

    HunTunChef() {
        super("煮馄饨");
        l.setIcon(new ImageIcon("src/com/wyc/command/example/ex1/image/HunTun.jpg"));
        this.add(l);
        this.setLocation(350, 50);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        this.setVisible(true);
    }
}
