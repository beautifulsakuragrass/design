package com.wyc.factorymethod.example.ex1;

/**
 * 具体工厂：养马场
 *
 * @author wyc
 * @date 2019/8/27
 */
public class HorseFarm implements AnimalFarm {

    /**
     * 生产动物
     *
     * @return Animal 动物
     */
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}
