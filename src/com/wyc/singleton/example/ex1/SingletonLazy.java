package com.wyc.singleton.example.ex1;

/**
 * 用懒汉式单例模式模拟产生美国当今总统对象。
 * <p>
 * 分析：在每一届任期内，美国的总统只有一人，所以本实例适合用单例模式实现，图 2 所示是用懒汉式单例实现的结构图。
 *
 * @author wyc
 * @date 2019/8/24
 */
public class SingletonLazy {

    public static void main(String[] args) {
        President zq = President.getInstance();
        zq.getName();
        President zlf = President.getInstance();
        zlf.getName();
        if (zq == zlf) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
    }
}
