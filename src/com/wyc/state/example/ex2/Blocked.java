package com.wyc.state.example.ex2;

/**
 * 具体状态类：阻塞状态
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Blocked extends ThreadState {
    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }

    public void resume(ThreadContext hj) {
        System.out.print("调用resume()方法-->");
        if ("阻塞状态".equals(stateName)) {
            hj.setState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }
}
