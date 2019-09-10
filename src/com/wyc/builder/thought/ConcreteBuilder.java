package com.wyc.builder.thought;

/**
 * 具体建造者：实现了抽象建造者接口。
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ConcreteBuilder extends AbstractBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartA("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartA("建造 PartC");
    }
}
