/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Martynas Vanagas
 */
public class DrawingBoard extends JPanel implements Updatable {

    private WormGame wormGame;
    private int pieceLenght;

    public DrawingBoard(WormGame wormGame, int pieceLenght) {
        this.wormGame = wormGame;
        this.pieceLenght = pieceLenght;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        for (Piece piece : wormGame.getWorm().getPieces()) {
            graphics.setColor(Color.BLACK);
            graphics.fill3DRect(pieceLenght * piece.getX(), pieceLenght * piece.getY(), pieceLenght, pieceLenght, true);
        }

        graphics.setColor(Color.RED);
        graphics.fillOval(pieceLenght * wormGame.getApple().getX(), pieceLenght * wormGame.getApple().getY(), pieceLenght, pieceLenght);
    }

    @Override
    public void update() {
        super.repaint();
    }
}
