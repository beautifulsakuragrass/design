package com.wyc.factorymethod.thought;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 读取配置文件
 *
 * @author wyc
 * @date 2019/8/27
 */
class ReadXml {

    /**
     * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     */
    static Object getObject() {
        // 配置文件路径
        String path = "src/com/wyc/factorymethod/thought/config1.xml";
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(path));
            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "com.wyc.factorymethod.thought." + classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(cName);
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
