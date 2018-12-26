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
public class OneThingBox extends Box {

    private Collection<Thing> box;

    public OneThingBox() {
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (this.box.size() != 1) { //Don't forget to implement this part of the method.
            this.box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.box.contains(thing); //Don't forget to implement this part of the method.
    }
}
