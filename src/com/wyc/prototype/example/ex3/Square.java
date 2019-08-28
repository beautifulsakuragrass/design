package com.wyc.prototype.example.ex3;

import java.util.Scanner;

/**
 * 正方形
 *
 * @author wyc
 * @date 2019/8/27
 */
public class Square implements Shape {

    /**
     * 拷贝
     *
     * @return Object 拷贝对象
     */
    @Override
    public Object clone() {
        Square b = null;
        try {
            b = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝正方形失败!");
        }
        return b;
    }

    /**
     * 计算面积
     */
    @Override
    public void countArea() {
        int a;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("该正方形的面积=" + a * a + "\n");
    }
}
