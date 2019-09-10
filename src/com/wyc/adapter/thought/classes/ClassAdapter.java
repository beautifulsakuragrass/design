package com.wyc.adapter.thought.classes;

/**
 * 类适配器类
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
