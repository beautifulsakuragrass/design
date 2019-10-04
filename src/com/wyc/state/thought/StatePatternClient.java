package com.wyc.state.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class StatePatternClient {
    public static void main(String[] args) {
        //创建环境 
        Context context = new Context();
        //处理请求
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
