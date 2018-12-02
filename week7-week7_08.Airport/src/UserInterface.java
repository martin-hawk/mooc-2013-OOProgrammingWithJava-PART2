
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class UserInterface {

    Scanner reader;
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    private ArrayList<Flight> flights = new ArrayList<Flight>();

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void startUI() {
        System.out.println("Airport panel");
        System.out.println("--------------------");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");
            String input = getString(this.reader);
            if (input.equals("1")) {
                addPlane();
            } else if (input.equals("2")) {
                addFlight();
            } else if (input.equals("x")) {
                break;
            }
        }

        System.out.println("Flight service");
        System.out.println("------------");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");
            String input = getString(this.reader);
            if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printPlaneInfo();
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    private String getString(Scanner reader) {
        return reader.nextLine();
    }

    private int getInteger(Scanner reader) {
        return Integer.parseInt(reader.nextLine());
    }

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String id = getString(this.reader);
        System.out.print("Give plane capacity: ");
        int capacity = getInteger(this.reader);
        this.planes.add(new Plane(id, capacity));
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = getString(this.reader);
        System.out.print("Give departure airport code: ");
        String from = getString(this.reader);
        System.out.print("Give destination airport code: ");
        String to = getString(this.reader);
        this.flights.add(new Flight(findPlane(id), from, to));
    }

    public Plane findPlane(String id) {
        for (Plane plane : this.planes) {
            if (plane.getPlaneID().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    private void printPlanes() {
        for (Plane plane : this.planes) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight : this.flights) {
            System.out.println(flight);
        }
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        Plane foundPlane = findPlane(getString(this.reader));
        System.out.println(foundPlane);
    }

}
