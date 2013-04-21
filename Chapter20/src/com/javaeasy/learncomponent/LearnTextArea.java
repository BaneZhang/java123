package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * User: bane
 * Date: 13-4-20
 * Time: 下午6:11
 */
public class LearnTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 150);
        frame.setLocation(100, 300);
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);

        JTextArea textArea = new JTextArea();
        textArea.setRows(7);
        textArea.setColumns(20);
        textArea.setText("这是一个文本域");

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(textArea);

        container.add(scrollPane);
        frame.setVisible(true);
    }
}
