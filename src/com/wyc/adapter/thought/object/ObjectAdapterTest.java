package com.wyc.adapter.thought.object;

/**
 * 客户端代码
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
