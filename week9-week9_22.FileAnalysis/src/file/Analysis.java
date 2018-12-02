/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Martynas Vanagas
 */
public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        int lines = 0;

        while (reader.hasNextLine()) {
            reader.nextLine();
            lines++;
        }
        return lines;
    }

    public int characters() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        reader.useDelimiter("");
        int characters = 0;

        while (reader.hasNext()) {
            reader.next();
            characters++;
        }

        return characters;
    }
}
