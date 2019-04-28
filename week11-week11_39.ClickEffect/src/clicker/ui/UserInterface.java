package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    Calculator calculator;

    public UserInterface() {
        this.calculator = new PersonalCalculator();
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);

        JLabel label = new JLabel("0");
        container.add(label);

        JButton button = new JButton("Click!");
        container.add(button, BorderLayout.SOUTH);
        ClickListener cl = new ClickListener(calculator, label);
        button.addActionListener(cl);
    }

    public JFrame getFrame() {
        return frame;
    }
}
