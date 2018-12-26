/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package farmsimulator;

/**
 *
 * @author Martynas Vanagas
 */
public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;

    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (this.capacity >= this.volume + amount) {
            volume += amount;
        } else {
            this.volume = this.capacity;
        }
    }

    public double getFromTank(double amount) {
        if (this.volume >= amount) {
            this.volume -= amount;
            return amount;
        } else {
            this.volume = 0;
            return this.volume;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity); //Don't forget to implement this part of the method and return the value.
    }

}
