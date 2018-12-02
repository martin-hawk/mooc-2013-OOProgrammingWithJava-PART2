/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package application;

import java.util.Random;

/**
 *
 * @author Martynas Vanagas
 */
public class Thermometer implements Sensor {

    private Boolean state;
    private Random measurement;

    public Thermometer() {
        this.state = false;
        this.measurement = new Random();
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        int min = -30;
        int max = 30;
        if (this.state) {
            int parameter = measurement.nextInt(max + 1 - min) + min;
            return parameter;
        } else {
            throw new IllegalStateException("Thermometer is off.");
        }
    }
}
