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
public abstract class Figure {

    int x;
    int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        this.x = this.x+dx;
        this.y =this.y+ dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void draw(Graphics graphics);
}
