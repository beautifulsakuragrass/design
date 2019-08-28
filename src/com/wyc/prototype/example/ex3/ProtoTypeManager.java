package com.wyc.prototype.example.ex3;

import java.util.HashMap;

/**
 * 原型管理类
 *
 * @author wyc
 * @date 2019/8/27
 */
public class ProtoTypeManager {

    private HashMap<String, Shape> hashMap = new HashMap<>(16);

    public ProtoTypeManager() {
        hashMap.put("circle", new Circle());
        hashMap.put("square", new Square());
    }

    public void addShape(String key, Shape obj) {
        hashMap.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = hashMap.get(key);
        return (Shape) temp.clone();
    }

}
