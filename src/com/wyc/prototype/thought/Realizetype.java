package com.wyc.prototype.thought;

/**
 * 原型模式
 *
 * @author wyc
 * @date 2019/8/24
 */
public class Realizetype implements Cloneable {

    /**
     * 构造方法
     */
    Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    /**
     * 克隆方法
     *
     * @return Object 克隆的对象
     * @throws CloneNotSupportedException 不支持该克隆
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
