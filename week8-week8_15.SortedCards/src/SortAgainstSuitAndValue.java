
import java.util.Comparator;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        if (card1.getSuit() - card2.getSuit() < 0) {
            return -1;
        } else if (card1.getSuit() - card2.getSuit() > 0) {
            return 1;
        } else if (card1.getSuit() - card2.getSuit() == 0) {
            return card1.compareTo(card2);
        }
        return 0;
    }
}
