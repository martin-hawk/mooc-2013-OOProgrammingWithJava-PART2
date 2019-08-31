/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reader.criteria;

/**
 *
 * @author Martynas Vanagas
 */
public class AtLeastOne implements Criterion {

    private Criterion[] criteria;

    public AtLeastOne(Criterion... criteria) {
        this.criteria = criteria;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion criterion : criteria) {
            if (criterion.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
