
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner) {
        for (RegistrationPlate registrationPlate : this.owners.keySet()) {
            if (registrationPlate.equals(plate)) {
                return false;
            }
        }

        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        for (RegistrationPlate registrationPlate : this.owners.keySet()) {
            if (registrationPlate.equals(plate)) {
                return this.owners.get(plate);
            }
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        for (RegistrationPlate registrationPlate : this.owners.keySet()) {
            if (registrationPlate.equals(plate)) {
                this.owners.remove(plate);
                return true;
            }
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate registrationPlate : this.owners.keySet()) {
            System.out.println(registrationPlate);
        }
    }
    
    public void printOwners() {
ArrayList<String> list = new ArrayList<String>();
        for (RegistrationPlate registrationPlate : this.owners.keySet()) {
            if (!list.contains(this.owners.get(registrationPlate))) {
               list.add(this.owners.get(registrationPlate));
            }
        }
        for (String string : list) {
            System.out.println(string);
        }
    }
}
