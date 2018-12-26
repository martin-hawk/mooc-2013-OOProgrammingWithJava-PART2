/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package dungeon;

/**
 *
 * @author Martynas Vanagas
 */
public class Figure {

    private String type;
    private int x, y;

    public Figure() {
        this.x = 0;
        this.y = 0;
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDistance() {
        return this.x + this.y;
    }

    public void move(char direction, int boundX, int boundY) {
    }

    public void move(String path, int boundX, int boundY) {
    }
}
