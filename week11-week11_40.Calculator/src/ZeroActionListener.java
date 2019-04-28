
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class ZeroActionListener implements ActionListener {

    private JTextField in;
    private JTextField out;
    private JButton zButton;

    public ZeroActionListener(JTextField in, JTextField out, JButton zButton) {
        this.in = in;
        this.out = out;
        this.zButton=zButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.in.setText("");
        this.out.setText("0");
        this.zButton.setEnabled(false);
    }
}
