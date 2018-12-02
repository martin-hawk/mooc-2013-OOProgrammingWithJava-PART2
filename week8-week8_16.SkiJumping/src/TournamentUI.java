
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class TournamentUI {
    
    private Scanner reader;
    private ArrayList<Jumper> jumpers;
    private HashMap<Integer, Round> rounds;
    
    public TournamentUI(Scanner reader) {
        this.reader = reader;
        this.jumpers = new ArrayList<Jumper>();
        this.rounds = new HashMap<Integer, Round>();
    }
    
    public void start() {
        int roundCounter = 0;
        System.out.println("Kumpula ski jumping week\n");
        
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String input = reader.nextLine();
            if (input.equals("")) {
                System.out.println("\nThe tournament begins!\n");
                break;
            } else {
                this.jumpers.add(new Jumper(input));
            }
        }
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("\nThanks!\n");
                System.out.println("Tournament results:");
                printTournamentResults();
                break;
            } else if (input.equals("jump")) {
                roundCounter++;
                this.rounds.put(roundCounter, new Round(jumpers));
                System.out.println("\nRound " + roundCounter + "\n");
                printJumpOrder();
                rounds.get(roundCounter).makeJump();
                rounds.get(roundCounter).vote();
                rounds.get(roundCounter).calculatePoints();
                printJumpResults(roundCounter);
            }
        }
    }
    
    public void printJumpOrder() {
        System.out.println("Jumping order:");
        Collections.sort(jumpers);
        for (int i = 0; i < jumpers.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + jumpers.get(i));
        }
        System.out.println("");
    }
    
    public void printJumpResults(int counter) {
        System.out.println("Results of round " + counter);
        for (Jumper jumper : jumpers) {
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.getJump(counter));
            System.out.println("    judge votes: " + rounds.get(counter).getVotes(jumper));
        }
    }
    
    public void printTournamentResults() {
        System.out.println("Position    Name");
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        for (int i = 0; i < jumpers.size(); i++) {
            System.out.println((i + 1) + "           " + jumpers.get(i));
            jumpers.get(i).printJumps();
            
        }
    }
}
