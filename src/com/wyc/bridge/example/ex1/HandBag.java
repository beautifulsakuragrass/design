package com.wyc.bridge.example.ex1;

/**
 * 扩展抽象化角色：挎包
 *
 * @author wyc
 * @date 2019/9/27
 */
public class HandBag extends Bag {

    /**
     * 抽象方法：获取名称
     *
     * @return String
     */
    @Override
    public String getName() {
        return color.getColor() + "HandBag";
    }
}
