package com.wyc.composite.thought.transparent;

/**
 * 抽象构件
 *
 * @author wyc
 * @date 2019/10/2
 */
public interface Component {

    /**
     * 增加
     *
     * @param c Component
     */
    public void add(Component c);

    /**
     * 删除
     *
     * @param c Component
     */
    public void remove(Component c);

    /**
     * 获取
     *
     * @param i int
     * @return Component
     */
    public Component getChild(int i);

    /**
     * 操作
     */
    public void operation();
}
