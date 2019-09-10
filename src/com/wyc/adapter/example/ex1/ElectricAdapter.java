package com.wyc.adapter.example.ex1;

/**
 * 电能适配器
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ElectricAdapter implements Motor {

    private ElectricMotor emotor;

    public ElectricAdapter() {
        emotor = new ElectricMotor();
    }

    @Override
    public void drive() {
        emotor.electricDrive();
    }
}
