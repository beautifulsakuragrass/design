package com.wyc.builder.example.ex1;

/**
 * 抽象建造者：装修工人
 *
 * @author wyc
 * @date 2019/9/10
 */
abstract class AbstractDecorator {
    /**
     * 创建产品对象
     */
    protected Parlour product = new Parlour();

    public abstract void buildWall();

    public abstract void buildTV();

    public abstract void buildSofa();

    /**
     * 返回产品对象
     *
     * @return
     */
    public Parlour getResult() {
        return product;
    }
}
