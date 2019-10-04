package com.wyc.state.example.ex2;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ThreadStateTest {
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
