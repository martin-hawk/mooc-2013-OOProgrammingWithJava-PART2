/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Martynas Vanagas
 */
public class BlackHoleBox extends Box {

    private Collection<Thing> box;

    public BlackHoleBox() {
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        this.box.add(thing); //Don't forget to implement this part of the method.
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false; //Don't forget to implement this part of the method.
    }

}
