package com.wyc.template.thought;

/**
 * 客户端程序
 *
 * @author wyc
 * @date 2019/10/3
 */
public class HookTemplateMethod {

    public static void main(String[] args) {
        AbstractHookClass tm = new HookConcreteClass();
        tm.templateMethod();
    }
}
