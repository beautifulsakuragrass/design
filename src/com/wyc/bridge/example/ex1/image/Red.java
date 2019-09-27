package com.wyc.bridge.example.ex1.image;

import com.wyc.bridge.example.ex1.Color;

/**
 * 具体实现化角色：红色
 *
 * @author wyc
 * @date 2019/9/27
 */
public class Red implements Color {

    /**
     * 红色
     *
     * @return String red
     */
    @Override
    public String getColor() {
        return "red";
    }
}
