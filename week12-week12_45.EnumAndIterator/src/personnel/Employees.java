/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Martynas Vanagas
 */
public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> persons) {
        for (Person person : persons) {
            this.employees.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
