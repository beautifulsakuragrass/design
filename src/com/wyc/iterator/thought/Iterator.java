package com.wyc.iterator.thought;

/**
 * 抽象迭代器
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface Iterator {

    /**
     * 第一个
     *
     * @return Object
     */
    Object first();

    /**
     * 下一个
     *
     * @return Object
     */
    Object next();

    /**
     * 下一个是否存在
     *
     * @return boolean
     */
    boolean hasNext();
}
