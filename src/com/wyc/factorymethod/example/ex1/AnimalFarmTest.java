package com.wyc.factorymethod.example.ex1;

import java.util.Objects;

/**
 * 测试类
 *
 * @author wyc
 * @date 2019/8/27
 */
public class AnimalFarmTest {

    public static void main(String[] args) {
        try {
            Animal a;
            AnimalFarm af;
            af = (AnimalFarm) ReadXml.getObject();
            a = Objects.requireNonNull(af).newAnimal();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
