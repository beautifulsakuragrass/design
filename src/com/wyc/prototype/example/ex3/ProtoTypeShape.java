package com.wyc.prototype.example.ex3;

/**
 * 测试类
 *
 * @author wyc
 * @date 2019/8/27
 */
public class ProtoTypeShape {

    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle) pm.getShape("circle");
        obj1.countArea();
        Shape obj2 = (Shape) pm.getShape("square");
        obj2.countArea();
    }
}
