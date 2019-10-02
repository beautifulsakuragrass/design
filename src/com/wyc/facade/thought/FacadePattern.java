package com.wyc.facade.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/2
 */
public class FacadePattern {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.method();
    }
}
