package com.wyc.state.example.ex1;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ScoreStateTest {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
