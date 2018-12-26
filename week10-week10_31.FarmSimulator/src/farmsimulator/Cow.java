/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Martynas Vanagas
 */
public class Cow implements Milkable, Alive {

    private String name;
    private double capacity;
    private double amount;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        int randomID = new Random().nextInt(NAMES.length);
        this.name = NAMES[randomID];
        this.capacity = 15 + new Random().nextInt(26);
        this.amount = 0;
    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
        this.amount = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return this.name + " " + this.amount + "/" + this.capacity; //Don't forget to implement this part of the method and return the value.
    }

    @Override
    public double milk() {
        double returnAmount = this.amount;
        this.amount = 0;
        return returnAmount; //Don't forget to implement this part of the method.
    }

    @Override
    public void liveHour() {
        double randomAmount = Math.ceil(0.7 + new Random().nextInt(2)); //Don't forget to implement this part of the method.
        if (this.capacity >= this.amount + randomAmount) {
            this.amount += randomAmount;
        } else {
            this.amount = this.capacity;
        }
    }

}
