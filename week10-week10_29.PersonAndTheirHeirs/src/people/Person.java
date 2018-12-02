/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package people;

/**
 *
 * @author Martynas Vanagas
 */
public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + "\n" + "  " + this.address; //Don't forget to implement this part of the method and return the value.
    }
}
