package com.wyc.chainofresponsibility.example.ex1;

/**
 * 具体处理者2：系主任类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class DepartmentHead extends AbstractLeader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("系主任批准您请假" + leaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
