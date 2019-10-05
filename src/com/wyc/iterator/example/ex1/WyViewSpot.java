package com.wyc.iterator.example.ex1;

/**
 * 婺源景点类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class WyViewSpot {

    private String name;

    private String introduce;

    WyViewSpot(String name, String introduce) {
        this.name = name;
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public String getIntroduce() {
        return introduce;
    }
}
