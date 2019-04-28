/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package clicker.applicationlogic;

/**
 *
 * @author Martynas Vanagas
 */
public class PersonalCalculator implements Calculator {

    private int value;

    public PersonalCalculator() {
        this.value = 0;
    }

    @Override
    public int giveValue() {
        return value; //Don't forget to implement this part of the method.
    }

    @Override
    public void increase() {
        value++; //Don't forget to implement this part of the method.
    }

}
