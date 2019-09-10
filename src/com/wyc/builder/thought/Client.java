package com.wyc.builder.thought;

/**
 * 客户类
 *
 * @author wyc
 * @date 2019/9/10
 */
public class Client {

    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
