package com.wyc.flyweight.example.ex1;

import java.awt.*;

/**
 * 具体享元角色：黑子
 *
 * @author wyc
 * @date 2019/10/2
 */
public class BlackPieces implements ChessPieces {

    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
