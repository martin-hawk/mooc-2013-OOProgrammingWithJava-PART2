/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Martynas Vanagas
 */
public class Reference {

    private RatingRegister theRegister;

    public Reference(RatingRegister ratingRegister) {
        this.theRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        Map<Person, Integer> similarityTable = new HashMap<Person, Integer>();
        ArrayList<Film> films = new ArrayList<Film>();
        Film toReturn = null;

        try {
            if (!this.theRegister.personalRatingRegister.get(person).isEmpty()) {
                Map<Film, Rating> myPersonalRatings = this.theRegister.getPersonalRatings(person);
                for (Film film : this.theRegister.ratingRegister.keySet()) {

                    for (Person reviewer : this.theRegister.reviewers()) {
                        // Eliminate self person
                        if (reviewer.equals(person)) {
                            continue;
                        }

                        // Calculate person's and every other reviewer's score
                        int similarity = 0;
                        if (myPersonalRatings.containsKey(film) && theRegister.getPersonalRatings(reviewer).containsKey(film)) {
                            similarity += myPersonalRatings.get(film).getValue() * theRegister.getPersonalRatings(reviewer).get(film).getValue();
                        }

                        // Eliminate those persons who haven't watched the same films and consider only matching (positive) ratings
                        if (similarity != 0 && similarity > 0) {
                            similarityTable.put(reviewer, similarity);
                        }
                    }
                }
                // Sort persons descending
                List<Person> similarReviewers = new ArrayList<Person>(similarityTable.keySet());
                Collections.sort(similarReviewers, new PersonComparator((Map<Person, Integer>) similarityTable));

                for (Person similarReviewer : similarReviewers) {
                    // For every not seen film
                    for (Film film : this.theRegister.getPersonalRatings(similarReviewer).keySet()) {
                        if (myPersonalRatings.containsKey(film)) {
                            continue;
                        }
                        // Get the recommended film
                        if (this.theRegister.getPersonalRatings(similarReviewer).get(film).getValue() > 1) {
                            toReturn = film;
                        }
                    }
                }
            }
        } catch (Exception e) { // If the person didn't add any rating
            for (Film film : this.theRegister.filmRatings().keySet()) {
                films.add(film);
            }
            Collections.sort(films, new FilmComparator(this.theRegister.filmRatings()));
            toReturn = films.get(0);
        }
        return toReturn;
    }
}
