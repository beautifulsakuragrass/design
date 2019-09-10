package com.wyc.adapter.thought.classes;

/**
 * 适配者接口
 *
 * @author wyc
 * @date 2019/9/10
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
