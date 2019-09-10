package com.wyc.builder.example.ex1;

/**
 * 具体建造者：具体装修工人2
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ConcreteDecorator2 extends AbstractDecorator {

    @Override
    public void buildWall() {
        product.setWall("w2");
    }

    @Override
    public void buildTV() {
        product.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
