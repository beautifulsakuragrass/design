package com.wyc.adapter.thought.classes;

/**
 * 客户端代码
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
