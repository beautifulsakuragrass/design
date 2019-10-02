package com.wyc.flyweight.example.ex1;

import java.awt.*;

/**
 * 具体享元角色：白子
 *
 * @author wyc
 * @date 2019/10/2
 */
public class WhitePieces implements ChessPieces {

    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
