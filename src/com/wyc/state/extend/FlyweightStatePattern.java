package com.wyc.state.extend;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class FlyweightStatePattern {

    public static void main(String[] args) {
        //创建环境
        ShareContext context = new ShareContext();
        //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
