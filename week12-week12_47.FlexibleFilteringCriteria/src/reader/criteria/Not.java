/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reader.criteria;

/**
 *
 * @author Martynas Vanagas
 */
public class Not implements Criterion {

    private Criterion criterion;

    public Not(Criterion criterion) {
        this.criterion = criterion;
    }

    @Override
    public boolean complies(String line) {
        return !this.criterion.complies(line);
    }

}
