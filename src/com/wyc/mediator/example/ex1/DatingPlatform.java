package com.wyc.mediator.example.ex1;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class DatingPlatform {

    public static void main(String[] args) {
        //房产中介
        Medium md = new EstateMedium();
        AbstractCustomer member1, member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        //客户注册
        md.register(member1);
        md.register(member2);
    }
}
