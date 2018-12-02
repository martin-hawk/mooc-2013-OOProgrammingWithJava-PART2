
import java.io.File;
import java.util.Scanner;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Printer {

    private String filename;

    public Printer(String filename) {
        this.filename = filename;
    }

    public void printLinesWhichContain(String word) throws Exception {
        File file = new File(filename);
        Scanner reader = new Scanner(file, "UTF-8");
        String nextLine = "";

        if (word.equals("")) {
            while (reader.hasNextLine()) {
                nextLine = reader.nextLine();
                System.out.println(nextLine);
            }
        } else {
            while (reader.hasNextLine()) {
                nextLine = reader.nextLine();
                if (nextLine.contains(word)) {
                    System.out.println(nextLine);
                }
            }
        }

        reader.close();
    }

}
