package com.wyc.observer.example.ex3;

import java.util.Observer;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class CrudeOilFutures {

    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        //多方
        Observer bull = new Bull();
        //空方
        Observer bear = new Bear();
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
