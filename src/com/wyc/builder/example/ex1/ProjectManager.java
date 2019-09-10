package com.wyc.builder.example.ex1;

/**
 * 指挥者：项目经理
 *
 * @author wyc
 * @date 2019/9/10
 */
public class ProjectManager {

    private AbstractDecorator builder;

    public ProjectManager(AbstractDecorator builder) {
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法
     *
     * @return Parlour 客厅对象
     */
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}
