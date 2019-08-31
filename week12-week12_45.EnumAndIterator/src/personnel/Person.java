/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package personnel;

/**
 *
 * @author Martynas Vanagas
 */
public class Person {

    private String name;
    private Education education;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public Education getEducation() {
        return this.education;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.education; //Don't forget to implement this part of the method and return the value.
    }
}
