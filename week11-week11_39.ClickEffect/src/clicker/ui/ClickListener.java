/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Martynas Vanagas
 */
public class ClickListener implements ActionListener {

    private Calculator calculator;
    private JLabel label;

    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase(); //Don't forget to implement this part of the method.
        String asText = "" + this.calculator.giveValue();
        label.setText(asText);
    }
}
