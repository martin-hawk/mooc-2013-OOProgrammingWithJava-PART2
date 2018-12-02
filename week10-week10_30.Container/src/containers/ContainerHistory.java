/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package containers;

import java.util.ArrayList;

/**
 *
 * @author Martynas Vanagas
 */
public class ContainerHistory {

    private ArrayList<Double> history;

    public ContainerHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return history.toString(); //Don't forget to implement this part of the method and return the value.
    }

    public double maxValue() {
        double returnValue = 0.0;
        if (this.history.isEmpty()) {
            returnValue = 0.0;
        } else {
            for (Double value : history) {
                returnValue = Math.max(returnValue, value);
            }
        }
        return returnValue;
    }

    public double minValue() {
        double returnValue = this.maxValue();
        if (this.history.isEmpty()) {
            returnValue = 0.0;
        } else {
            for (Double value : history) {
                returnValue = Math.min(returnValue, value);
            }
        }
        return returnValue;
    }

    public double average() {
        double returnValue;
        if (this.history.isEmpty()) {
            returnValue = 0.0;
        } else {
            double total = 0.0;
            int count = 0;
            for (Double value : history) {
                total += value;
                count++;
            }
            returnValue = total / count;
        }
        return returnValue;
    }

    public double greatestFluctuation() {
        Double toReturn = 0.0;
        if (this.history.isEmpty() || this.history.size() == 1) {
            toReturn = 0.0;
        } else {
            for (int i = 0; i < this.history.size(); i++) {
                try {
                    toReturn = Math.max(toReturn, Math.abs(this.history.get(i) - this.history.get(i + 1)));
                } catch (Exception e) {
                }
            }
        }

        return toReturn;
    }

    public double variance() {
        Double toReturn;
        Double variance = 0.0;
        if (this.history.isEmpty() || this.history.size() == 1) {
            toReturn = 0.0;
        } else {
            for (Double value : history) {
                variance += Math.pow(value - average(), 2);
            }
            toReturn = variance / (this.history.size() - 1);
        }
        return toReturn;
    }
}
