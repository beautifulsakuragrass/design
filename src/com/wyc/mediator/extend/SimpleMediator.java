package com.wyc.mediator.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单单例中介者
 *
 * @author wyc
 * @date 2019/10/3
 */
public class SimpleMediator {
    private static SimpleMediator smd = new SimpleMediator();
    private List<SimpleColleague> colleagues = new ArrayList<>(16);

    private SimpleMediator() {
    }

    public static SimpleMediator getMedium() {
        return (smd);
    }

    public void register(SimpleColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    public void relay(SimpleColleague scl) {
        for (SimpleColleague ob : colleagues) {
            if (!ob.equals(scl)) {
                ob.receive();
            }
        }
    }
}
