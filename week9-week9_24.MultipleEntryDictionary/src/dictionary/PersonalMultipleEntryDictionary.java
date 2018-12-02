/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Martynas Vanagas
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> words;

    public PersonalMultipleEntryDictionary() {
        this.words = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.words.containsKey(word)) {
            this.words.put(word, new HashSet<String>());
        }

        this.words.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (!this.words.containsKey(word)) {
            return null;
        }
        return this.words.get(word);
    }

    @Override
    public void remove(String word) {
        if (this.words.containsKey(word)) {
            this.words.remove(word);
        }
    }
}
