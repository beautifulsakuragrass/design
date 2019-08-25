package singleton.example.ex2;

import javax.swing.*;
import java.awt.*;

/**
 * 测试方法
 *
 * @author wyc
 * @date 2019/8/24
 */
public class SingletonEager {
    public static void main(String[] args) {
        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        BaJie obj1 = BaJie.getInstance();
        contentPane.add(obj1);
        BaJie obj2 = BaJie.getInstance();
        contentPane.add(obj2);
        if (obj1 == obj2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
