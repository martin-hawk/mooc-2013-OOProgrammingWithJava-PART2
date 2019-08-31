/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package wormgame.domain;

/**
 *
 * @author Martynas Vanagas
 */
public class Piece {

    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece) {
        return piece.getX() == this.x && piece.getY() == this.y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

}
