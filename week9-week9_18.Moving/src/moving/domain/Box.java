/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martynas Vanagas
 */
public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> box;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= maximumCapacity) {
            box.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : box) {
            volume += thing.getVolume();
        }
        return volume; //Don't forget to implement this part of the method.
    }

    @Override
    public String toString() {
        String list = "";
        for (Thing thing : box) {
            list += thing.toString() + "\n";
        } //Don't forget to implement this part of the method and return the value.
        return list;
    }
}
