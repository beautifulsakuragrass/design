package com.wyc.command.example.ex1;

import javax.swing.*;

/**
 * 接收者：肠粉厨师
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ChangFenChef extends JFrame {

    private static final long serialVersionUID = 1L;

    JLabel l = new JLabel();

    ChangFenChef() {
        super("煮肠粉");
        l.setIcon(new ImageIcon("src/com/wyc/command/example/ex1/image/ChangFen.jpg"));
        this.add(l);
        this.setLocation(30, 30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        this.setVisible(true);
    }
}
