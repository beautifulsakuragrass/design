package com.wyc.prototype.example.ex3;

/**
 * 图形接口
 *
 * @author wyc
 * @date 2019/8/27
 */
public interface Shape extends Cloneable {
    /**
     * 拷贝
     *
     * @return Object 拷贝对象
     */
    Object clone();

    /**
     * 计算面积
     */
    void countArea();
}
