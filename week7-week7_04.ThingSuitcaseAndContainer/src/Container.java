
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
public class Container {

    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();
    private int maxWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((totalWeight() + suitcase.totalWeight()) <= this.maxWeight) {
            this.container.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return this.container.size() + " suitcases (" + totalWeight() + " kg)"; //To change body of generated methods, choose Tools | Templates.
    }

    public int totalWeight() {
        int weight = 0;

        for (Suitcase suitcase : this.container) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Suitcase suitcase : this.container) {
            suitcase.printThings();
        }
    }
}
