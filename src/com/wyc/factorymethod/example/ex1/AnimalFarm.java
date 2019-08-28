package com.wyc.factorymethod.example.ex1;

/**
 * 抽象工厂：畜牧场
 *
 * @author wyc
 * @date 2019/8/27
 */
public interface AnimalFarm {

    /**
     * 生产动物
     *
     * @return Animal 动物
     */
    Animal newAnimal();
}
