package com.wyc.interpreter.example.ex1;

/**
 * 环境类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Context {

    /**
     * 城市
     */
    private Expression cityPerson;

    /**
     * 构造函数
     */
    public Context() {
        String[] cities = {"韶关", "广州"};
        Expression city = new TerminalExpression(cities);
        String[] persons = {"老人", "妇女", "儿童"};
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    /**
     * 免费
     *
     * @param info String
     */
    public void freeRide(String info) {
        boolean ok = cityPerson.interpret(info);
        if (ok) {
            System.out.println("您是" + info + "，您本次乘车免费！");
        } else {
            System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
        }
    }
}
