package com.wyc.observer.example.ex2;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class BellEventTest {

    public static void main(String[] args) {
        //铃（事件源）
        BellEventSource bell = new BellEventSource();
        //注册监听器（老师）
        bell.addPersonListener(new TeachEventListener());
        //注册监听器（学生）
        bell.addPersonListener(new StuEventListener());
        //打上课铃声
        bell.ring(true);
        System.out.println("------------");
        //打下课铃声
        bell.ring(false);
    }
}
