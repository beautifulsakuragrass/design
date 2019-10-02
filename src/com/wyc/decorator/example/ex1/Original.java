package com.wyc.decorator.example.ex1;

import javax.swing.*;
import java.awt.*;

/**
 * 具体构件角色：原身
 *
 * @author wyc
 * @date 2019/10/2
 */
public class Original extends JFrame implements Morrigan {

    private static final long serialVersionUID = 1L;

    private String t = "Morrigan0.jpg";

    public Original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    public void setImage(String t) {
        this.t = t;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        String path = "src/com/wyc/decorator/example/ex1/image/";
        JLabel l1 = new JLabel(new ImageIcon(path + t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
