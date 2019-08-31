/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import wormgame.Direction;

/**
 *
 * @author Martynas Vanagas
 */
public class Worm {

    private int originalX;
    private int originalY;
    private Direction originalDirection;
    private List<Piece> worm;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = originalDirection;
        this.worm = new ArrayList<Piece>();
        this.worm.add(new Piece(originalX, originalY));
        this.grow = false;
    }

    public Direction getDirection() {
        return originalDirection;
    }

    public void setDirection(Direction direction) {
        this.originalDirection = direction;
    }

    public int getLength() {
        return worm.size();
    }

    public List<Piece> getPieces() {
        return worm;
    }

    public void move() {
        int nextX = worm.get(worm.size() - 1).getX();
        int nextY = worm.get(worm.size() - 1).getY();

        if (originalDirection == Direction.UP) {
            nextY--;
        } else if (originalDirection == Direction.DOWN) {
            nextY++;
        } else if (originalDirection == Direction.LEFT) {
            nextX--;
        } else if (originalDirection == Direction.RIGHT) {
            nextX++;
        }

        if (getLength() > 2 && !grow) {
            worm.remove(0);
        }

        if (grow == true) {
            grow = false;
        }

        worm.add(new Piece(nextX, nextY));
    }

    public void grow() {
        grow = true;
    }

    public Piece getHead() {
        return worm.get(getLength() - 1);
    }

    public boolean runsInto(Piece piece) {
        for (int i = 0; i < getLength(); i++) {
            if (worm.get(i).getX() == piece.getX() && worm.get(i).getY() == piece.getY()) {
                return true;
            }
        }

        return false;
    }

    public boolean runsIntoItself() {
        for (int i = 0; i < getLength() - 1; i++) {
            if (worm.get(getLength() - 1).getX() == worm.get(i).getX() && worm.get(getLength() - 1).getY() == worm.get(i).getY()) {
                return true;
            }
        }
        return false;
    }
}
