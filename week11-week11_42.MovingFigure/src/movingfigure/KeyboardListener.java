/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Martynas Vanagas
 */
public class KeyboardListener implements KeyListener {

    private Component component;
    private Figure figure;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("Keystroke " + e.getKeyCode() + " pressed.");
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                figure.move(0, -1);
                break;
            case KeyEvent.VK_DOWN:
                figure.move(0, 1);
                break;
            case KeyEvent.VK_LEFT:
                figure.move(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
                figure.move(1, 0);
                break;
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
