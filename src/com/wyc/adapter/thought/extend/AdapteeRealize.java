package com.wyc.adapter.thought.extend;

/**
 * 适配者实现
 *
 * @author wyc
 * @date 2019/9/10
 */
public class AdapteeRealize implements TwoWayAdaptee {

    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
