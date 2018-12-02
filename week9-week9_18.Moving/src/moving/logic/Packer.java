/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Martynas Vanagas
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> packedBoxes = new ArrayList<Box>();

        for (Thing thing : things) {
            Box box = new Box(boxesVolume);
            if (box.getVolume() + thing.getVolume() <= boxesVolume) {
                box.addThing(thing);
            }
            packedBoxes.add(box);
        }
        return packedBoxes;
    }
}
