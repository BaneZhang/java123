package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * User: bane
 * Date: 13-4-20
 * Time: 下午5:40
 */
public class LearnLabel {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 100);
        jFrame.setLocation(new Point(100, 300));
        jFrame.setTitle("学习Swing的组件");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = jFrame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);

        JLabel label = new JLabel();
        label.setText("这是一个标签");

        container.add(label);
        jFrame.setVisible(true);

        try {
            Thread.sleep(5000);
            label.setEnabled(false);
            Thread.sleep(5000);
            label.setVisible(false);
            Thread.sleep(5000);
            label.setVisible(true);
            Thread.sleep(5000);
            label.setEnabled(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
