package com.wyc.flyweight.example.ex1;

import java.awt.*;

/**
 * 抽象享元角色：棋子
 *
 * @author wyc
 * @date 2019/10/2
 */
public interface ChessPieces {

    /**
     * 下子
     *
     * @param g  Graphics 颜色
     * @param pt Point 位置
     */
    public void DownPieces(Graphics g, Point pt);
}
