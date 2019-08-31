/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Martynas Vanagas
 */
public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> personIdentities = new HashMap<Person, Integer>();

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.personIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (personIdentities.get(o1) == personIdentities.get(o2)) {
            return 0;
        } else if (personIdentities.get(o1) > personIdentities.get(o2)) {
            return -1;
        } else {
            return 1;
        }
    }
}
