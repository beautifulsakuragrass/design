package com.wyc.iterator.example.ex1;

/**
 * 抽象聚合：婺源景点集接口
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface ViewSpotSet {
    /**
     * 增加
     *
     * @param obj WyViewSpot
     */
    void add(WyViewSpot obj);

    /**
     * 删除
     *
     * @param obj WyViewSpot
     */
    void remove(WyViewSpot obj);

    /**
     * 迭代
     *
     * @return ViewSpotIterator
     */
    ViewSpotIterator getIterator();
}
