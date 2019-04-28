package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

//    public DrawingBoard() {
//        super.setBackground(Color.WHITE);
//    }
//
//    @Override
//    protected void paintComponent(Graphics graphics) {
//        super.paintComponent(graphics);
//
//        graphics.fillRect(100, 50, 50, 50);
//        graphics.fillRect(250, 50, 50, 50);
//        graphics.fillRect(25, 200, 50, 50);
//        graphics.fillRect(75, 250, 250, 50);
//        graphics.fillRect(325, 200, 50, 50);
//    }
    private Avatar avatar;

    public DrawingBoard(Avatar avatar) {
        super.setBackground(Color.WHITE);
        this.avatar = avatar;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        avatar.draw(graphics);
    }
}
