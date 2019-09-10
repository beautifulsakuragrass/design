package com.wyc.adapter.example.ex1;

/**
 * 光能适配器
 *
 * @author wyc
 * @date 2019/9/10
 */
public class OpticalAdapter implements Motor {

    private OpticalMotor omotor;

    public OpticalAdapter() {
        omotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        omotor.opticalDrive();
    }
}
