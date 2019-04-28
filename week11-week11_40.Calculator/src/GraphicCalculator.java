
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private JTextField output;
    private JTextField input;

    @Override
    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame);

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout mainLayout = new GridLayout(3, 1);
        container.setLayout(mainLayout);

        output = new JTextField("0");
        output.setEnabled(false);
        container.add(output);

        input = new JTextField("0");
        container.add(input);
        container.add(buttonPanel(), BorderLayout.SOUTH);
    }

    private JPanel buttonPanel() {
        JPanel buttonMenu = new JPanel(new GridLayout(1, 3));
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton zeroButton = new JButton("Z");

        PlusActionListener pal = new PlusActionListener(this.input, this.output, zeroButton);
        plusButton.addActionListener(pal);
        buttonMenu.add(plusButton);

        MinusActionListener mal = new MinusActionListener(this.input, this.output, zeroButton);
        minusButton.addActionListener(mal);
        buttonMenu.add(minusButton);

        buttonMenu.add(zeroButton);
        zeroButton.setEnabled(false);
        ZeroActionListener zal = new ZeroActionListener(this.input, this.output, zeroButton);
        zeroButton.addActionListener(zal);

        return buttonMenu;
    }

    public JFrame getFrame() {
        return frame;
    }
}
