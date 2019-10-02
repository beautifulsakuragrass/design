package com.wyc.flyweight.thought;

/**
 * 非享元角色
 *
 * @author wyc
 * @date 2019/10/2
 */
public class UnsharedConcreteFlyweight {

    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
