package com.wyc.iterator.thought;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<>(16);

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
