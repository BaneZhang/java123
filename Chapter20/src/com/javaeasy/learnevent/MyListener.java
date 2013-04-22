package com.javaeasy.learnevent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 * User: Bane
 * Date: 13-4-22
 * Time: 15:12
 */
public class MyListener implements ActionListener {
    private int counter = 0;
    private JLabel label;

    public MyListener(JLabel label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        counter++;
        label.setText("事件触发了" + counter + "次。");
    }
}
