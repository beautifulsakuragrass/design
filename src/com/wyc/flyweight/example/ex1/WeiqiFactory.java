package com.wyc.flyweight.example.ex1;

import java.util.ArrayList;

/**
 * 享元工厂角色
 *
 * @author wyc
 * @date 2019/10/2
 */
public class WeiqiFactory {

    private ArrayList<ChessPieces> qz;

    public WeiqiFactory() {
        qz = new ArrayList<>(16);
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);
    }

    public ChessPieces getChessPieces(String type) {
        if ("w".equalsIgnoreCase(type)) {
            return qz.get(0);
        } else if ("b".equalsIgnoreCase(type)) {
            return qz.get(1);
        } else {
            return null;
        }
    }
}
