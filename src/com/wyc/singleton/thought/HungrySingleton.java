package com.wyc.singleton.thought;

/**
 * 饿汉加载的单例模式
 *
 * @author wyc
 * @date 2019/8/24
 */
public class HungrySingleton {
    /**
     * HungrySingleton实例
     */
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * 私有的构造方法
     */
    private HungrySingleton() {

    }

    /**
     * 返回HungrySingleton实例
     *
     * @return HungrySingleton HungrySingleton实例
     */
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
