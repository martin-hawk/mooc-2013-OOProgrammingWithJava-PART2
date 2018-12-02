/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martynas Vanagas
 */
public class Plane {

    private String planeID;
    private int capacity;

    public Plane(String planeID, int capacity) {
        this.planeID = planeID;
        this.capacity = capacity;
    }

    public String getPlaneID() {
        return planeID;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return this.getPlaneID() + " (" + this.getCapacity() + " ppl)"; //To change body of generated methods, choose Tools | Templates.
    }
}
