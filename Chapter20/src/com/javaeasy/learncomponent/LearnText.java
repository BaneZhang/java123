package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * User: bane
 * Date: 13-4-20
 * Time: 下午5:55
 */
public class LearnText {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 100);
        frame.setLocation(100, 300);
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);

        JTextField textField = new JTextField();
        textField.setText("这是一个文本框");
        container.add(textField);
        frame.setVisible(true);

        try {
            Thread.sleep(10000);
            String content = textField.getText();
            System.out.println(content);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
