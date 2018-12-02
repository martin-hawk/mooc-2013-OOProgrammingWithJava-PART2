/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package people;

/**
 *
 * @author Martynas Vanagas
 */
public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euros/month"; //Don't forget to implement this part of the method and return the value.
    }

}
