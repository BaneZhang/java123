package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.Point;
import javax.swing.JFrame;

/**
 * User: Bane
 * Date: 13-4-17
 * Time: 17:44
 */
public class LearnJFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 100);
        jFrame.setLocation(100, 100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        jFrame.setVisible(true);
    }
}
