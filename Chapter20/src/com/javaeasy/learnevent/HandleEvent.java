package com.javaeasy.learnevent;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * User: Bane
 * Date: 13-4-22
 * Time: 15:15
 */
public class HandleEvent {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    public void init() {
        frame.setSize(300, 100);
        frame.setLocation(100, 300);
        frame.setTitle("学习Swing的事件处理");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2, 3));
        container.add(label);
        container.add(button);

        MyListener listener = new MyListener(label);
        button.addActionListener(listener);
    }

    public HandleEvent() {
        frame = new JFrame();
        button = new JButton("有事件处理器的按钮");
        label = new JLabel();
        init();
    }

    public void showFrame() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HandleEvent handleEvent = new HandleEvent();
        handleEvent.showFrame();
    }
}
