package com.javaeasy.learnlayout;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * User: Bane
 * Date: 13-4-22
 * Time: 12:00
 */
public class LearnGridBagLayout {
    public static void main(String [] args) {
        JFrame frame = new JFrame("学习Swing的布局管理器");
        frame.setSize(600, 200);
        frame.setLocation(100, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        GridBagLayout layout = new GridBagLayout();
        container.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        JButton button1 = new JButton("按钮1");
        JButton button2 = new JButton("按钮2");
        JButton button3 = new JButton("按钮3");
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.ORANGE);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        GridLayout panel2Layout = new GridLayout(2, 3);
        panel2.setLayout(panel2Layout);
        panel2.add(new JButton("面板内的按钮1"));
        panel2.add(new JButton("面板内的按钮2"));
        panel2.add(new JButton("面板内的按钮3"));
        panel2.add(new JButton("面板内的按钮4"));
        panel2.add(new JButton("面板内的按钮5"));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        container.add(button1, gbc);

        gbc.gridx = 1;
        container.add(panel1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 0;
        container.add(button2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0;
        gbc.weighty = 0;
        container.add(button3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        container.add(panel2, gbc);

        frame.setVisible(true);
    }
}
