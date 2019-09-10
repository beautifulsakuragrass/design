package com.wyc.builder.thought;

/**
 * 指挥者：调用建造者中的方法完成复杂对象的创建。
 *
 * @author wyc
 * @date 2019/9/10
 */
public class Director {

    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法
     *
     * @return
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
