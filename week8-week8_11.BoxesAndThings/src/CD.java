/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martynas Vanagas
 */
public class CD implements ToBeStored {

    private String artist;
    private String title;
    private int year;
    private double weight;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.year + ")"; //Don't forget to implement this part of the method and return the value.
    }

}
