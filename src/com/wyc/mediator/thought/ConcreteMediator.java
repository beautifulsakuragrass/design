package com.wyc.mediator.thought;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteMediator extends AbstractMediator {

    private List<AbstractColleague> colleagues = new ArrayList<AbstractColleague>();

    @Override
    public void register(AbstractColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(AbstractColleague cl) {
        for (AbstractColleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((AbstractColleague) ob).receive();
            }
        }
    }
}
