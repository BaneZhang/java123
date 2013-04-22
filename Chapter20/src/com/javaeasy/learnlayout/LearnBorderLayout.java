package com.javaeasy.learnlayout;

import java.awt.Container;
import java.awt.Point;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 * User: Bane
 * Date: 13-4-22
 * Time: 11:27
 */
public class LearnBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 100);
        frame.setLocation(new Point(100, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("学习Swing的布局管理器");

        Container container = frame.getContentPane();
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);

        JButton btn1 = new JButton("东");
        JButton btn2 = new JButton("西");
        JButton btn3 = new JButton("南");
        JButton btn4 = new JButton("北");
        JButton btn5 = new JButton("中");

        container.add(btn1, BorderLayout.EAST);
        container.add(btn2, BorderLayout.WEST);
        container.add(btn3, BorderLayout.SOUTH);
        container.add(btn4, BorderLayout.NORTH);
        container.add(btn5, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
