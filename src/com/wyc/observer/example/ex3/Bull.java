package com.wyc.observer.example.ex3;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者类：多方
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Bull implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，多方高兴了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，多方伤心了！");
        }
    }
}
