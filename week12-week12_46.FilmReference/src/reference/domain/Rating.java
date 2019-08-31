/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reference.domain;

/**
 *
 * @author Martynas Vanagas
 */
public enum Rating {
    BAD(-5),
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);

    private int value;

    private Rating(int num) {
        this.value = num;
    }

    public int getValue() {
        return this.value;
    }
}
