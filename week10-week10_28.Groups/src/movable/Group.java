/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author Martynas Vanagas
 */
public class Group implements Movable {

    private ArrayList<Movable> group = new ArrayList<Movable>();

    @Override
    public String toString() {
        String toReturn = ""; //Don't forget to implement this part of the method and return the value.

        for (int i = 0; i < this.group.size() - 1; i++) {
            toReturn += this.group.get(i) + "\n";
        }
        try {
            toReturn += this.group.get(this.group.size() - 1);
        } catch (Exception e) {
        }

        return toReturn;
    }

    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable object : this.group) { //Don't forget to implement this part of the method.
            object.move(dx, dy);
        }
    }
}
