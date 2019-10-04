package com.wyc.observer.example.ex1;

/**
 * 具体目标：人民币汇率
 *
 * @author wyc
 * @date 2019/10/3
 */
public class RMBrate extends Rate {

    @Override
    public void change(int number) {
        for (Company obs : companys) {
            ((Company) obs).response(number);
        }
    }
}