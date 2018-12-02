/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package movable;

/**
 *
 * @author Martynas Vanagas
 */
public class Organism implements Movable {

    private int x, y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + this.x + "; y: " + this.y; //Don't forget to implement this part of the method and return the value.
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx; //Don't forget to implement this part of the method.
        this.y += dy;
    }

}
