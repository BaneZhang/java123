package com.javaeasy.learnlayout;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

/**
 * User: Bane
 * Date: 13-4-22
 * Time: 11:37
 */
public class LearnGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("这是一个窗口");
        frame.setSize(600, 150);
        frame.setLocation(100, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menuBar.add(new JMenu("这是菜单一"));
        menuBar.add(new JMenu("这是菜单二"));

        Container container = frame.getContentPane();
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

        container.add(new JLabel("这是一个标签，可以用来显示文字。"));
        container.add(new JTextField("这是一个文本框，用户可以用它输入文字。"));
        container.add(new JComboBox(new Object[]{"这是一个组合框，可以用来下拉并选择其中的条目。"}));
        container.add(new JButton("这是一个按钮，用户可以单击按钮。"));

        frame.setVisible(true);
    }
}
