package com.wyc.abstractfactory.example.ex1;

/**
 * 抽象工厂：农场类
 *
 * @author wyc
 * @date 2019/9/10
 */
public interface Farm {

    /**
     * 培养动物
     *
     * @return Animal 动物
     */
    public Animal newAnimal();

    /**
     * 培养植物
     *
     * @return Plant 植物
     */
    public Plant newPlant();
}
