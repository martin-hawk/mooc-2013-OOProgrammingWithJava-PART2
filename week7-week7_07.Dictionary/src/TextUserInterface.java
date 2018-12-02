
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Statements: ");
            System.out.println("  add - adds a word pair to the dictionary");
            System.out.println("  translate - asks a word and prints its translation");
            System.out.println("  quit - quits the text user interface");
            System.out.println("");
            System.out.print("Statement: ");
            String input = getInput(this.reader);
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
            System.out.println("");
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String word = getInput(reader);
        System.out.print("Translation: ");
        String translation = getInput(reader);

        this.dictionary.add(word, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String word = getInput(reader);

        String translation = this.dictionary.translate(word);
        System.out.println("Translation: " + translation);
    }

    private String getInput(Scanner reader) {
        String input = reader.nextLine();
        return input;
    }
}
