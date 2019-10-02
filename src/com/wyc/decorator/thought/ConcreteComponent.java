package com.wyc.decorator.thought;

/**
 * 具体构件角色
 *
 * @author wyc
 * @date 2019/10/2
 */
public class ConcreteComponent implements Component {

    /**
     * 具体的构建方法
     */
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    /**
     * 具体的实现方法
     */
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
