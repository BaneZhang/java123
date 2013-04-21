package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * User: bane
 * Date: 13-4-20
 * Time: 下午6:22
 */
public class LearnComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("学习Swing的组件");
        frame.setSize(300, 100);
        frame.setLocation(100, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);

        JComboBox comboBox = new JComboBox(new Object[]{"选项一", "选项二"});
        comboBox.addItem("选项三");
        comboBox.setSelectedIndex(1);
        Object object = comboBox.getSelectedItem();
        System.out.println(object.toString());

        container.add(comboBox);
        frame.setVisible(true);
    }
}
