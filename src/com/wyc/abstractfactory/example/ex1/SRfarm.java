package com.wyc.abstractfactory.example.ex1;

/**
 * 具体工厂：上饶农场类
 *
 * @author wyc
 * @date 2019/9/10
 */
public class SRfarm implements Farm {

    /**
     * 培养动物
     *
     * @return Animal 动物
     */
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }

    /**
     * 培养植物
     *
     * @return Plant 植物
     */
    @Override
    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}
