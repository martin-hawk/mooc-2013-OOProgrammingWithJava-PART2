/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Martynas Vanagas
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> strings;
    private int duplicateCount;

    public PersonalDuplicateRemover() {
        this.strings = new HashSet<String>();
        this.duplicateCount = 0;
    }

    @Override
    public void add(String characterString) {
        if (!this.strings.contains(characterString)) {
            this.strings.add(characterString);
        } else {
            duplicateCount++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.strings;
    }

    @Override
    public void empty() {
        this.strings.clear();
        this.duplicateCount = 0;
    }

}
