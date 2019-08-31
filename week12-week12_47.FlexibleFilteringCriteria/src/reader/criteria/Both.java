/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reader.criteria;

/**
 *
 * @author Martynas Vanagas
 */
public class Both implements Criterion {

    private Criterion criterion1;
    private Criterion criterion2;

    public Both(Criterion criterion1, Criterion criterion2) {
        this.criterion1 = criterion1;
        this.criterion2 = criterion2;
    }

    @Override
    public boolean complies(String line) {
        return this.criterion1.complies(line) && this.criterion2.complies(line);
    }
}
