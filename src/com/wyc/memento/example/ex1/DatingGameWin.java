package com.wyc.memento.example.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 客户窗体类
 *
 * @author wyc
 * @date 2019/10/3
 */
public class DatingGameWin extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel eastJP;
    private JRadioButton girl1, girl2, girl3, girl4;
    private JButton button1;
    private JButton button2;
    private String fileName;
    private JLabel g;
    private You you;
    private GirlStack girls;

    DatingGameWin() {
        super("利用备忘录模式设计相亲游戏");
        you = new You();
        girls = new GirlStack();
        this.setBounds(0, 0, 900, 380);
        this.setResizable(false);
        fileName = "src/com/wyc/memento/example/ex1/image/四大美女.jpg";
        g = new JLabel(new ImageIcon(fileName), JLabel.CENTER);
        JPanel centerJP = new JPanel();
        centerJP.setLayout(new GridLayout(1, 4));
        centerJP.setBorder(BorderFactory.createTitledBorder("四大美女如下："));
        centerJP.add(g);
        this.add("Center", centerJP);
        eastJP = new JPanel();
        eastJP.setLayout(new GridLayout(1, 1));
        eastJP.setBorder(BorderFactory.createTitledBorder("您选择的爱人是："));
        this.add("East", eastJP);
        JPanel southJP = new JPanel();
        JLabel info = new JLabel("四大美女有“沉鱼落雁之容、闭月羞花之貌”，您选择谁？");
        girl1 = new JRadioButton("西施", true);
        girl2 = new JRadioButton("貂蝉");
        girl3 = new JRadioButton("王昭君");
        girl4 = new JRadioButton("杨玉环");
        button1 = new JButton("确定");
        button2 = new JButton("返回");
        ButtonGroup group = new ButtonGroup();
        group.add(girl1);
        group.add(girl2);
        group.add(girl3);
        group.add(girl4);
        southJP.add(info);
        southJP.add(girl1);
        southJP.add(girl2);
        southJP.add(girl3);
        southJP.add(girl4);
        southJP.add(button1);
        southJP.add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        this.add("South", southJP);
        showPicture("空白");
        you.setWife("空白");
        //保存状态
        girls.push(you.createMemento());
    }

    /**
     * 显示图片
     *
     * @param name String
     */
    private void showPicture(String name) {
        //清除面板内容
        eastJP.removeAll();
        //刷新屏幕
        eastJP.repaint();
        you.setWife(name);
        fileName = "src/com/wyc/memento/example/ex1/image/" + name + ".jpg";
        g = new JLabel(new ImageIcon(fileName), JLabel.CENTER);
        eastJP.add(g);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean ok;
        if (e.getSource() == button1) {
            //保存状态
            ok = girls.push(you.createMemento());
            if (ok && girl1.isSelected()) {
                showPicture("西施");
            } else if (ok && girl2.isSelected()) {
                showPicture("貂蝉");
            } else if (ok && girl3.isSelected()) {
                showPicture("王昭君");
            } else if (ok && girl4.isSelected()) {
                showPicture("杨玉环");
            }
        } else if (e.getSource() == button2) {
            //恢复状态
            you.restoreMemento(girls.pop());
            showPicture(you.getWife());
        }
    }
}
