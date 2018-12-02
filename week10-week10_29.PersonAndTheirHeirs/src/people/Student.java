/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package people;

/**
 *
 * @author Martynas Vanagas
 */
public class Student extends Person {

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        credits = 0;
    }

    public int credits() {
        return this.credits;
    }

    public void study() {
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  credits " + this.credits(); //Don't forget to implement this part of the method and return the value.
    }

}
