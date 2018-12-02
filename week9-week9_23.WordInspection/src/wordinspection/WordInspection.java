/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martynas Vanagas
 */
public class WordInspection {

    private File file;
    private List<String> wordList = new ArrayList<String>();

    public WordInspection(File file) throws FileNotFoundException {
        this.file = file;
        wordList = getWordList(file);
    }

    public int wordCount() {
        int count = 0;

        for (String string : wordList) {
            count++;
        }
        return count;
    }

    public List<String> wordsContainingZ() {
        List<String> list = new ArrayList();

        for (String string : wordList) {
            if (string.contains("z")) {
                list.add(string);
            }
        }
        return list;
    }

    public List<String> wordsEndingInL() {
        List<String> list = new ArrayList();

        for (String string : wordList) {
            if (string.endsWith("l")) {
                list.add(string);
            }
        }
        return list;
    }

    public List<String> palindromes() {
        List<String> polindromeList = new ArrayList<String>();

        for (String string : wordList) {
            if (isPalindrome(string)) {
                polindromeList.add(string);
            }
        }
        return polindromeList;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> vowelWordList = new ArrayList<String>();

        for (String string : wordList) {
            if (string.contains("a") && string.contains("e") && string.contains("i")
                    && string.contains("o") && string.contains("u") && string.contains("y")
                    && string.contains("ä") && string.contains("ö")) {
                vowelWordList.add(string);
            }
        }
        return vowelWordList;
    }

    private List<String> getWordList(File file) throws FileNotFoundException {
        List<String> wList = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();
            wList.add(word);
        }
        return wList;
    }

    private boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
