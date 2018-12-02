
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Suitcase {

    private ArrayList<Thing> suitcase = new ArrayList<Thing>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if ((totalWeight() + thing.getWeight()) <= this.maxWeight) {
            this.suitcase.add(thing);
        }
    }

    @Override
    public String toString() {
        if (this.suitcase.isEmpty()) {
            return "empty" + " (" + totalWeight() + " kg)";
        } else if (this.suitcase.size() == 1) {
            return this.suitcase.size() + " thing (" + totalWeight() + " kg)";
        } else {
            return this.suitcase.size() + " things (" + totalWeight() + " kg)"; //To change body of generated methods, choose Tools | Templates.
        }
    }

    public int totalWeight() {
        int weight = 0;

        for (Thing thing : this.suitcase) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Thing thing : this.suitcase) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = null;
        if (this.suitcase.isEmpty()) {
            return heaviest;
        } else {
            heaviest = this.suitcase.get(0);
            for (Thing thing : suitcase) {

                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
            return heaviest;
        }
    }
}
