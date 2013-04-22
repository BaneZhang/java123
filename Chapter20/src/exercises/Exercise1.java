package exercises;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * User: Bane
 * Date: 13-4-22
 * Time: 15:47
 */
public class Exercise1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle");
        frame.setSize(600, 600);
        frame.setLocation(100, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        GridBagLayout layout = new GridBagLayout();
        container.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        JTextField textField1 = new JTextField("1");
        JTextField textField2 = new JTextField("2");
        JTextField textField3 = new JTextField("3");
        JTextField textField4 = new JTextField("4");
        JTextField textField5 = new JTextField("5");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 2.0 / 3.0;
        gbc.weighty = 1.0 / 3.0;
        gbc.fill = GridBagConstraints.BOTH;
        container.add(textField1, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.weightx = 1.0 / 3.0;
        gbc.weighty = 2.0 / 3.0;
        gbc.fill = GridBagConstraints.BOTH;
        container.add(textField2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 2.0 / 3.0;
        gbc.weighty = 1.0 / 3.0;
        gbc.fill = GridBagConstraints.BOTH;
        container.add(textField3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.weightx = 1.0 / 3.0;
        gbc.weighty = 2.0 / 3.0;
        gbc.fill = GridBagConstraints.BOTH;
        container.add(textField4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0 / 3.0;
        gbc.weighty = 1.0 / 3.0;
        gbc.fill = GridBagConstraints.BOTH;
        container.add(textField5, gbc);

        frame.setVisible(true);
    }
}
