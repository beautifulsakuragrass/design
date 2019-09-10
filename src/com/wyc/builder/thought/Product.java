package com.wyc.builder.thought;

/**
 * 产品角色：包含多个组成部件的复杂对象。
 *
 * @author wyc
 * @date 2019/9/10
 */
public class Product {

    /**
     * 部件a
     */
    private String partA;
    /**
     * 部件b
     */
    private String partB;
    /**
     * 部件c
     */
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    /**
     * 显示
     */
    public void show() {
        //显示产品的特性
    }
}
