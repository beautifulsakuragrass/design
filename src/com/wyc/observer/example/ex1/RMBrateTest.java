package com.wyc.observer.example.ex1;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class RMBrateTest {

    public static void main(String[] args) {
        Rate rate = new RMBrate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        rate.change(-9);
    }
}
