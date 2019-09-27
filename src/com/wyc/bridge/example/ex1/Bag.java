package com.wyc.bridge.example.ex1;

/**
 * 抽象化角色：包
 *
 * @author wyc
 * @date 2019/9/27
 */
public abstract class Bag {

    protected Color color;

    /**
     * 获取颜色
     *
     * @param color Color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 抽象方法：获取名称
     *
     * @return String
     */
    public abstract String getName();
}
