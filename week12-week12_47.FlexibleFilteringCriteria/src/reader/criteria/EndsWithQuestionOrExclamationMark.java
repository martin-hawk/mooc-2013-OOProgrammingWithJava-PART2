/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reader.criteria;

/**
 *
 * @author Martynas Vanagas
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {

    @Override
    public boolean complies(String line) {
        if (line.endsWith("?")) {
            return true;
        } else if (line.endsWith("!")) {
            return true;
        }
        return false; //Don't forget to implement this part of the method.
    }

}
