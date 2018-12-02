
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand otherHand) {
        int handValue = 0;
        int otherHandValue = 0;
        for (Card card : hand) {
            handValue += card.getValue();
        }

        for (Card otherCard : otherHand.hand) {
            otherHandValue += otherCard.getValue();
        }
        return handValue - otherHandValue;
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
