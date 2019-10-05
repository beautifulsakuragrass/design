package com.wyc.iterator.example.ex1;

/**
 * 抽象迭代器：婺源景点迭代器接口
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface ViewSpotIterator {

    /**
     * 下一个是否存在
     *
     * @return boolean
     */
    boolean hasNext();

    /**
     * 第一个
     *
     * @return WyViewSpot
     */
    WyViewSpot first();

    /**
     * 下一个
     *
     * @return WyViewSpot
     */
    WyViewSpot next();

    /**
     * 上一个
     *
     * @return WyViewSpot
     */
    WyViewSpot previous();

    /**
     * 最后一个
     *
     * @return WyViewSpot
     */
    WyViewSpot last();
}
