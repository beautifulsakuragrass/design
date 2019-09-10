package com.wyc.adapter.thought.extend;

/**
 * 双向适配器
 *
 * @author wyc
 * @date 2019/9/10
 */
public class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {

    private TwoWayTarget target;

    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }
}
