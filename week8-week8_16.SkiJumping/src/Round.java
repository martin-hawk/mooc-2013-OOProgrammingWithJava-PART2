
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Round {
    
    private ArrayList<Jumper> jumpers;
    private HashMap<Jumper, ArrayList<Integer>> votes;
    
    public Round(ArrayList<Jumper> jumpers) {
        this.jumpers = jumpers;
        this.votes = new HashMap<Jumper, ArrayList<Integer>>();
    }
    
    public void makeJump() {
        Random randomNumber = new Random();
        for (Jumper jumper : jumpers) {
            int length = randomNumber.nextInt(120 - 60 + 1) + 60;
            jumper.addJump(length);
        }
    }
    
    public void vote() {
        Random randomNumber = new Random();
        for (Jumper jumper : jumpers) {
            ArrayList<Integer> votesArray = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++) {
                int vote = randomNumber.nextInt(20 - 10 + 1) + 10;
                votesArray.add(vote);
            }
            votes.put(jumper, votesArray);
        }
    }
    
    public String getVotes(Jumper jumper) {
        String toReturn = "[";
        ArrayList<Integer> tempList = votes.get(jumper);
        for (int i = 0; i < tempList.size() - 1; i++) {
            toReturn += tempList.get(i) + ", ";
        }
        toReturn += tempList.get(tempList.size() - 1) + "]\n";
        return toReturn;
    }
    
    public void calculatePoints() {
        int points;
        for (Jumper jumper : jumpers) {
            points = jumper.getPoints();
            ArrayList<Integer> jumpsArray = jumper.getJumps();
            
            points += jumpsArray.get(jumpsArray.size() - 1);
            
            ArrayList<Integer> votesArray = votes.get(jumper);
            votesArray.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2; //Don't forget to implement this part of the method.
                }
            });
            for (int i = 1; i < 4; i++) {
                points += votesArray.get(i);
            }
            jumper.setTotalPoints(points);
        }
    }
}
