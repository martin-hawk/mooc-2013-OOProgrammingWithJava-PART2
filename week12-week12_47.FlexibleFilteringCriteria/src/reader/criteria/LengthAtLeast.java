/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reader.criteria;

/**
 *
 * @author Martynas Vanagas
 */
public class LengthAtLeast implements Criterion {

    private int lenght;

    public LengthAtLeast(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean complies(String line) {
        return (line.length() >= this.lenght);
    }

}
