package com.wyc.observer.example.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标：汇率
 *
 * @author wyc
 * @date 2019/10/3
 */
public abstract class Rate {

    protected List<Company> companys = new ArrayList<Company>();

    /**
     * 增加观察者方法
     *
     * @param company Company
     */
    public void add(Company company) {
        companys.add(company);
    }

    /**
     * 删除观察者方法
     *
     * @param company Company
     */
    public void remove(Company company) {
        companys.remove(company);
    }

    public abstract void change(int number);
}
