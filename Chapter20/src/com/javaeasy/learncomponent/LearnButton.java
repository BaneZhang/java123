package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * User: bane
 * Date: 13-4-20
 * Time: 下午6:30
 */
public class LearnButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("学习Swing的组件");
        frame.setSize(300, 100);
        frame.setLocation(100, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);

        JButton button = new JButton("按钮");
        container.add(button);

        frame.setVisible(true);
    }
}
