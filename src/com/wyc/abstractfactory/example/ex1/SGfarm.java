package com.wyc.abstractfactory.example.ex1;

/**
 * 具体工厂：韶关农场类
 *
 * @author wyc
 * @date 2019/9/10
 */
public class SGfarm implements Farm {

    /**
     * 培养动物
     *
     * @return Animal 动物
     */
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    /**
     * 培养植物
     *
     * @return Plant 植物
     */
    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
