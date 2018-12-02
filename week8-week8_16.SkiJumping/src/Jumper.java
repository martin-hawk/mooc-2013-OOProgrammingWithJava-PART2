
import java.util.ArrayList;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Jumper implements Comparable<Jumper> {

    private String name;
    private int totalPoints;
    private ArrayList<Integer> jumps;

    public Jumper(String name) {
        this.name = name;
        this.totalPoints = 0;
        this.jumps = new ArrayList<Integer>();
    }

    public void addJump(int lenght) {
        this.jumps.add(lenght);
    }

    public int getJump(int round) {
        return jumps.get(round - 1);
    }

    public ArrayList<Integer> getJumps() {
        return jumps;
    }

    public void printJumps() {
        System.out.print("            jump lengths: ");
        for (int i = 0; i < jumps.size() - 1; i++) {
            System.out.print(jumps.get(i) + " m, ");
        }
        System.out.println(jumps.get(jumps.size() - 1) + " m");
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int points) {
        this.totalPoints = points;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getPoints() + " points)"; //Don't forget to implement this part of the method and return the value.
    }

    @Override
    public int compareTo(Jumper otherJumper) {
        return this.totalPoints - otherJumper.getPoints(); //Don't forget to implement this part of the method.
    }
}
