package com.wyc.iterator.thought;

/**
 * 抽象聚合
 *
 * @author wyc
 * @date 2019/10/3
 */
public interface Aggregate {
    /**
     * 增加
     *
     * @param obj Object
     */
    public void add(Object obj);

    /**
     * 删除
     *
     * @param obj Object
     */
    public void remove(Object obj);

    /**
     * 迭代
     *
     * @return Iterator
     */
    public Iterator getIterator();
}
