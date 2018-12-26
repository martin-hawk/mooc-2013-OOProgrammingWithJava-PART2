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
public class MaxWeightBox extends Box {

    private int maxWeight;
    private Collection<Thing> box;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.box = new ArrayList<Thing>();
    }

    public int getCurrentBoxWeight() {
        int toReturn = 0;
        for (Thing thing : this.box) {
            toReturn += thing.getWeight();
        }
        return toReturn;
    }

    @Override
    public void add(Thing thing) {
        if (this.maxWeight >= (thing.getWeight() + getCurrentBoxWeight())) { //Don't forget to implement this part of the method.
            this.box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.box.contains(thing); //Don't forget to implement this part of the method.
    }
}
