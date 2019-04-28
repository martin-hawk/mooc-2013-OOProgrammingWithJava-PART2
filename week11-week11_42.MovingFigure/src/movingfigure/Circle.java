/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Martynas Vanagas
 */
public class Circle extends Figure {

    private int d;

    public Circle(int x, int y, int d) {
        super(x, y);
        this.d = d;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval(x, y, d, d);
    }

}
