/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martynas Vanagas
 */
public class MindfulDictionary {

    private File file;
    private Scanner fileReader;
    private Map<String, String> dictionary;
    private FileWriter fileWriter;

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String fileName) throws FileNotFoundException {
        this.file = new File(fileName);

        this.dictionary = new HashMap<String, String>();
    }

    public boolean load() {
        try {
            this.fileReader = new Scanner(file);
            while (this.fileReader.hasNextLine()) {
                String[] tempWords = this.fileReader.nextLine().split("\\:");
                this.dictionary.put(tempWords[0], tempWords[1]);
            }
            this.fileReader.close();
        } catch (FileNotFoundException ex) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try {
            this.fileWriter = new FileWriter(this.file);
            for (String key : this.dictionary.keySet()) {
                this.fileWriter.write(key + ":" + this.dictionary.get(key) + "\n");
            }
            this.fileWriter.close();
        } catch (IOException e) {
        }
        return this.file.canWrite();
    }

    public void add(String word, String translation) {
        if (translate(word) == null) {
            if (translate(translation) == null) {
                this.dictionary.put(word, translation);
            }
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.containsValue(word)) {
            return getKeyFromValue(this.dictionary, word).toString();
        }
        return null;
    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        } else if (this.dictionary.containsValue(word)) {
            String value = getKeyFromValue(this.dictionary, word).toString();
            this.dictionary.remove(value);
        }
    }

    public static Object getKeyFromValue(Map map, Object value) {
        for (Object object : map.keySet()) {
            if (map.get(object).equals(value)) {
                return object;
            }
        }
        return null;
    }
}
