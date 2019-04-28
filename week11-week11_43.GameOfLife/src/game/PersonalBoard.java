/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Martynas Vanagas
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        for (int x = 0; x < super.getWidth(); x++) {
            for (int y = 0; y < super.getHeight(); y++) {
                if (new Random().nextDouble() < d) {
                    turnToLiving(x, y);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (i < super.getWidth() && i >= 0 && i1 < super.getHeight() && i1 >= 0) {
            return super.getBoard()[i][i1];
        } else {
            return false;
        }
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (i < super.getWidth() && i >= 0 && i1 < super.getHeight() && i1 >= 0) {
            super.getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (i < super.getWidth() && i >= 0 && i1 < super.getHeight() && i1 >= 0) {
            super.getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int neighbours = 0;
        for (int x = i - 1; x <= i + 1; x++) {
            for (int y = i1 - 1; y <= i1 + 1; y++) {
                if (x < super.getWidth() && x >= 0 && y < super.getHeight() && y >= 0) {
                    if (x == i && y == i1) {
                    } else {
                        if (isAlive(x, y)) {
                            neighbours++;
                        }
                    }
                }
            }
        }
        return neighbours;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
// Every living cell dies if they have less than two living neighbours.
        if (i2 < 2) {
            turnToDead(i, i1);
        }

// Every living cell keeps on living during the following iteration (i.e. turn) if they have two or three living neighbours.
        if ((i2 == 2 || i2 == 3) && isAlive(i, i1)) {
            //do nothing
        }

// Every living cell dies if they have more than three living neighbours.
        if (i2 > 3 && isAlive(i, i1)) {
            turnToDead(i, i1);
        }

// Every dead cell is turned back to life if they have exactly three living neighbours.
        if (i2 == 3 && isAlive(i, i1) == false) {
            turnToLiving(i, i1);
        }
    }
}
