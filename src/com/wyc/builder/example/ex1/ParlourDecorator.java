package com.wyc.builder.example.ex1;

/**
 * 测试
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ParlourDecorator {

    public static void main(String[] args) {
        try {
            AbstractDecorator d;
            d = (AbstractDecorator) ReadXML.getObject();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
