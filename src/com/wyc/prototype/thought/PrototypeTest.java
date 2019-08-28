package com.wyc.prototype.thought;

/**
 * 测试类
 *
 * @author wyc
 * @date 2019/8/24
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}
