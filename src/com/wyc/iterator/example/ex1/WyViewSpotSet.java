package com.wyc.iterator.example.ex1;

import java.util.ArrayList;

/**
 * 具体聚合：婺源景点集
 *
 * @author wyc
 * @date 2019/10/3
 */
public class WyViewSpotSet implements ViewSpotSet {

    private ArrayList<WyViewSpot> list = new ArrayList<>(16);

    @Override
    public void add(WyViewSpot obj) {
        list.add(obj);
    }

    @Override
    public void remove(WyViewSpot obj) {
        list.remove(obj);
    }

    @Override
    public ViewSpotIterator getIterator() {
        return (new WyViewSpotIterator(list));
    }
}
