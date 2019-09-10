package com.wyc.adapter.thought.extend;

/**
 * 目标实现
 *
 * @author wyc
 * @date 2019/9/10
 */
public class TargetRealize implements TwoWayTarget {

    @Override
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
