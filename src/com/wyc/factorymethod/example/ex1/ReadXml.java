package com.wyc.factorymethod.example.ex1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 读取配置文件路径
 *
 * @author wyc
 * @date 2019/8/27
 */
class ReadXml {

    /**
     * 根据类名称生成类实例
     *
     * @return Object 实例化对象
     */
    static Object getObject() {

        // 配置文件路径
        String path = "src/com/wyc/factorymethod/example/ex1/config2.xml";

        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File(path));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "com.wyc.factorymethod.example.ex1." + classNode.getNodeValue();
            System.out.println("新类名：" + cName);
            Class<?> c = Class.forName(cName);
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
