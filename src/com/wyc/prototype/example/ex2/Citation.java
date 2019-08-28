package com.wyc.prototype.example.ex2;

/**
 * 奖状类
 *
 * @author wyc
 * @date 2019/8/27
 */
public class Citation implements Cloneable {
    /**
     * 名字
     */
    private String name;
    /**
     * 奖状信息
     */
    private String info;
    /**
     * 学院
     */
    private String college;

    Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return (this.name);
    }

    /**
     * 输出奖状信息
     */
    void display() {
        System.out.println(name + info + college);
    }

    /**
     * 克隆方法
     *
     * @return Object 克隆的对象
     * @throws CloneNotSupportedException 可能出现的异常
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return (Citation) super.clone();
    }
}


