/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package moving.domain;

/**
 *
 * @author Martynas Vanagas
 */
public class Item implements Thing, Comparable<Item> {

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return volume; //Don't forget to implement this part of the method.
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getVolume() + " dm^3)"; //Don't forget to implement this part of the method and return the value.
    }

    @Override
    public int compareTo(Item comparable) {
        return volume - comparable.getVolume(); //Don't forget to implement this part of the method.
    }
}
