package com.wyc.chainofresponsibility.example.ex1;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class LeaveApprovalTest {
    public static void main(String[] args) {
        //组装责任链
        AbstractLeader teacher1 = new ClassAdviser();
        AbstractLeader teacher2 = new DepartmentHead();
        AbstractLeader teacher3 = new Dean();
        AbstractLeader teacher4 = new DeanOfStudies();
        //挂载责任链
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(8);
    }
}
