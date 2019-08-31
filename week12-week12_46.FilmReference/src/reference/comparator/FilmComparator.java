/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Martynas Vanagas
 */
public class FilmComparator implements Comparator<Film> {

    HashMap<Film, List<Rating>> filmRatings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.filmRatings = (HashMap<Film, List<Rating>>) ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        int average1 = 0;
        int average2 = 0;

        for (Rating rating : filmRatings.get(o1)) {
            average1 += rating.getValue();
        }
        average1 /= filmRatings.get(o1).size();

        for (Rating rating : filmRatings.get(o2)) {
            average2 += rating.getValue();
        }
        average2 /= filmRatings.get(o2).size();

        return average2 - average1;
    }
}
