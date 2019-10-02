package com.wyc.decorator.thought;

/**
 * 抽象装饰角色
 *
 * @author wyc
 * @date 2019/10/2
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
