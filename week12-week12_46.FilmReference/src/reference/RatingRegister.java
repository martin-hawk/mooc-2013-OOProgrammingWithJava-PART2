/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Martynas Vanagas
 */
public class RatingRegister {

    HashMap<Film, ArrayList<Rating>> ratingRegister;
    HashMap<Person, HashMap<Film, Rating>> personalRatingRegister;

    public RatingRegister() {
        this.ratingRegister = new HashMap<Film, ArrayList<Rating>>();
        this.personalRatingRegister = new HashMap<Person, HashMap<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!this.ratingRegister.containsKey(film)) {
            this.ratingRegister.put(film, new ArrayList<Rating>());
        }
        this.ratingRegister.get(film).add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!this.personalRatingRegister.containsKey(person)) {
            this.personalRatingRegister.put(person, new HashMap<Film, Rating>());
            this.personalRatingRegister.get(person).put(film, rating);
            addRating(film, rating);
        } else {
            if (!this.personalRatingRegister.get(person).containsKey(film)) {
                this.personalRatingRegister.get(person).put(film, rating);
                addRating(film, rating);
            }
        }
    }

    public List<Rating> getRatings(Film film) {
        return this.ratingRegister.get(film);
    }

    public Rating getRating(Person person, Film film) {
        Rating toReturn = Rating.NOT_WATCHED;
        if (this.personalRatingRegister.containsKey(person)) {
            if (this.personalRatingRegister.get(person).containsKey(film)) {
                toReturn = this.personalRatingRegister.get(person).get(film);
            }
        }
        return toReturn;
    }

    public Map<Film, List<Rating>> filmRatings() {
        Map<Film, List<Rating>> toReturn = new HashMap<Film, List<Rating>>();
        for (Film film : this.ratingRegister.keySet()) {
            toReturn.put(film, getRatings(film));
        }
        return toReturn;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        Map<Film, Rating> toReturn = new HashMap<Film, Rating>();
        try {
            for (Film film : this.personalRatingRegister.get(person).keySet()) {
                toReturn.put(film, this.personalRatingRegister.get(person).get(film));
            }
        } catch (Exception e) {
        }
        return toReturn;
    }

    public List<Person> reviewers() {
        List<Person> toReturn = new ArrayList<Person>();
        for (Person person : this.personalRatingRegister.keySet()) {
            toReturn.add(person);
        }
        return toReturn;
    }
}
