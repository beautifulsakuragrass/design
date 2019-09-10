package com.wyc.adapter.example.ex1;

/**
 * 客户端代码
 *
 * @author wyc
 * @date 2019/9/10
 */
public class MotorAdapterTest {

    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        Motor motor = (Motor) ReadXML.getObject();
        motor.drive();
    }
}
