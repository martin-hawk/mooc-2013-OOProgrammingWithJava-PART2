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
public class Box extends Figure {

    private int width;
    private int height;

    public Box(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(x, y, width, height);
    }

}
