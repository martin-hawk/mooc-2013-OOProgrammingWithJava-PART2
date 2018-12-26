/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package farmsimulator;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Martynas Vanagas
 */
public class Farm implements Alive {
    
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new LinkedList<Cow>();
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }
    
    public String getCows() {
        String toReturn;
        if (this.cows.isEmpty()) {
            toReturn = "No cows.";
        } else {
            toReturn = "Animals:";
            for (Cow cow : this.cows) {
                toReturn += "\n        " + cow.toString();
            }
        }
        return toReturn;
    }
    
    @Override
    public void liveHour() {
        for (Cow cow : this.cows) {
            cow.liveHour();
        } //Don't forget to implement this part of the method.
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }
    
    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }
    
    @Override
    public String toString() {
        return "Farm owner: " + this.owner + "\nBarn bulk tank: " + this.barn.toString() + "\n" + getCows(); //Don't forget to implement this part of the method and return the value.
    }
    
}
