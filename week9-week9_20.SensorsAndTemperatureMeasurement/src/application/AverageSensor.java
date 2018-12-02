/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martynas Vanagas
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int parameter = 0;

        if (this.isOn() == false || sensors.size() == 0) {
            throw new IllegalStateException("State is illegal.");
        }

        for (Sensor sensor : sensors) {
            parameter += sensor.measure();
        }
        parameter = parameter / sensors.size();
        readings.add(parameter);

        return parameter;
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    public List<Integer> readings() {
        return readings;
    }
}
