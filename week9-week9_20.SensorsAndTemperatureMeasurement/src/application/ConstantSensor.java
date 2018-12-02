/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package application;

/**
 *
 * @author Martynas Vanagas
 */
public class ConstantSensor implements Sensor {

    private int parameter;

    public ConstantSensor(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.parameter;
    }

}
