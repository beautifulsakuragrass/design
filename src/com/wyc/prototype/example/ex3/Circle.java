package com.wyc.prototype.example.ex3;

import java.util.Scanner;

/**
 * 圆
 *
 * @author wyc
 * @date 2019/8/27
 */
public class Circle implements Shape {

    /**
     * 拷贝
     *
     * @return Object 拷贝对象
     */
    @Override
    public Object clone() {
        Circle w = null;
        try {
            w = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆失败!");
        }
        return w;
    }

    /**
     * 计算面积
     */
    @Override
    public void countArea() {
        int r;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }
}
