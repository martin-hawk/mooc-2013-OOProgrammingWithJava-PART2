
import java.util.ArrayList;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        if (thing.weight() + weight() < this.maxWeight) {
            this.things.add(thing);
        }
    }

    @Override
    public double weight() {
        double actualWeight = 0;

        for (ToBeStored thing : things) {
            actualWeight += thing.weight();
        }
        return actualWeight; //Don't forget to implement this part of the method.
    }

    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg"; //Don't forget to implement this part of the method and return the value.
    }

}
