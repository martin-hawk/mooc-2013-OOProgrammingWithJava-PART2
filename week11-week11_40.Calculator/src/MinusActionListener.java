
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
public class MinusActionListener implements ActionListener {
    
    private JTextField in;
    private JTextField out;
    private JButton zButton;
    
    public MinusActionListener(JTextField in, JTextField out, JButton zButton) {
        this.in = in;
        this.out = out;
        this.zButton=zButton;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int input = 0;
        int output;
        
        try {
            input = Integer.parseInt(this.in.getText());
        } catch (NumberFormatException nfe) {
            this.in.setText("");
        }
        
        if (this.out.getText().isEmpty()) {
            output = 0;
        } else {
            output = Integer.parseInt(this.out.getText());
        }
        
        int result = output - input;
        
        this.out.setText("" + result);
        this.in.setText("");
        
        if (result==0) {
            this.zButton.setEnabled(false);
        } else{
            this.zButton.setEnabled(true);
        }
    }
}
