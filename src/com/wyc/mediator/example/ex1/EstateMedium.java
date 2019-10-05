package com.wyc.mediator.example.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者：房地产中介
 *
 * @author wyc
 * @date 2019/10/3
 */
public class EstateMedium implements Medium {

    private List<AbstractCustomer> members = new ArrayList<>(16);

    @Override
    public void register(AbstractCustomer member) {
        if (!members.contains(member)) {
            members.add(member);
            member.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String ad) {
        for (AbstractCustomer ob : members) {
            String name = ob.getName();
            if (!name.equals(from)) {
                ob.receive(from, ad);
            }
        }
    }

}

