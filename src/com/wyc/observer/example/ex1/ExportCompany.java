package com.wyc.observer.example.ex1;

/**
 * 具体观察者2：出口公司
 *
 * @author wyc
 * @date 2019/10/3
 */
public class ExportCompany implements Company{

    @Override
    public void response(int number) {
        if (number > 0) {
            System.out.println("人民币汇率升值" + number + "个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
        } else if (number < 0) {
            System.out.println("人民币汇率贬值" + (-number) + "个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
        }
    }
}
