package com.wyc.composite.thought.security;

import java.util.ArrayList;

/**
 * 树枝构件
 *
 * @author wyc
 * @date 2019/10/3
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<>(16);

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
