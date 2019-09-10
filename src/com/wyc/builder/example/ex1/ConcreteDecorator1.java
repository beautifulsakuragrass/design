package com.wyc.builder.example.ex1;

/**
 * 具体建造者：具体装修工人1
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ConcreteDecorator1 extends AbstractDecorator {

    @Override
    public void buildWall() {
        product.setWall("w1");
    }

    @Override
    public void buildTV() {
        product.setTV("TV1");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
