package com.wyc.adapter.thought.object;

/**
 * 对象适配器类
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
