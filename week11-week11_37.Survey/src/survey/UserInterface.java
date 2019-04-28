package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(220, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        container.add(yes);
        JCheckBox no = new JCheckBox("No!");
        container.add(no);

        container.add(new JLabel("Why?"));

        JRadioButton radio1 = new JRadioButton("No reason.");
        JRadioButton radio2 = new JRadioButton("Because it is fun!");

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        container.add(radio1);
        container.add(radio2);

        JButton button = new JButton("Done!");

        container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }
}
