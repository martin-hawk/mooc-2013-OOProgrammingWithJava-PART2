package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection wI = new WordInspection(file);
        System.out.println(wI.wordCount());
        System.out.println(wI.wordsContainingZ());
        System.out.println(wI.wordsEndingInL());
        System.out.println(wI.palindromes());
        System.out.println(wI.wordsWhichContainAllVowels());
    }
}
