package com.wyc.flyweight.thought;

/**
 * 具体享元角色
 *
 * @author wyc
 * @date 2019/10/2
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + outState.getInfo());
    }
}
