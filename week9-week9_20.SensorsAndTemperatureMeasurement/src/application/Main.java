/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package application;

/**
 *
 * @author Martynas Vanagas
 */
public class Main {

    public static void main(String[] args) {
        /*ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println(ten.measure());
        System.out.println(minusFive.measure());

        System.out.println(ten.isOn());
        ten.off();
        System.out.println(ten.isOn());*/

 /*Thermometer t = new Thermometer(Boolean.TRUE, 0);
        t.on();
        System.out.println(t.isOn());
        System.out.println(t.measure());*/
 /*Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is " + kumpula.measure() + " degrees");

        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");*/
        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");

        System.out.println("readings: " + helsinkiArea.readings());
    }
}
