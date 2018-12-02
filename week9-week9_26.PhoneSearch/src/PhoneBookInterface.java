
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class PhoneBookInterface {

    private PhoneBook phoneBook = new PhoneBook();
    private Scanner reader = new Scanner(System.in);

    public void start() {
        boolean exit = false;

        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");

        while (!exit) {
            System.out.print("\ncommand: ");

            String choise = getInput();
            String name;
            String number;
            String street;
            String city;
            ArrayList<String> values;
            HashMap<String, ArrayList<String>> personalValues;

            if (!choise.equals("x")) {
                int choiseInt = Integer.parseInt(choise);
                switch (choiseInt) {
                    case 1:
                        System.out.print("whose number: ");
                        name = getInput();
                        System.out.print("number: ");
                        number = getInput();
                        phoneBook.addNewPhone(name, number);
                        break;
                    case 2:
                        System.out.print("whose number: ");
                        name = getInput();
                        values = phoneBook.getNumberByName(name);
                        for (Object value : values) {
                            if (value.equals("not found")) {
                                System.out.println("  " + value);
                            } else {
                                System.out.println(" " + value);
                            }
                        }
                        break;
                    case 3:
                        System.out.print("number: ");
                        number = getInput();
                        values = phoneBook.getNameByNumber(number);
                        for (String value : values) {
                            System.out.println(" " + value);
                        }
                        break;
                    case 4:
                        System.out.print("whose address: ");
                        name = getInput();
                        System.out.print("street: ");
                        street = getInput();
                        System.out.print("city: ");
                        city = getInput();
                        phoneBook.addNewAddress(name, street, city);
                        break;
                    case 5:
                        System.out.print("whose information: ");
                        name = getInput();
                        personalValues = phoneBook.getPersonalInformation(name);
                        printPersonalInformation(personalValues);
                        break;
                    case 6:
                        System.out.print("whose information: ");
                        name = getInput();
                        phoneBook.deletePersonalInformation(name);
                        break;
                    case 7:
                        System.out.print("keyword (if empty, all listed): ");
                        name = getInput();
                        LinkedHashMap<String, HashMap<String, ArrayList<String>>> list = phoneBook.filteredListing(name);
                        if (list.isEmpty()) {
                            System.out.println(" keyword not found");
                        } else {
                            for (Map.Entry<String, HashMap<String, ArrayList<String>>> entry : list.entrySet()) {
                                String key = entry.getKey();
                                HashMap<String, ArrayList<String>> value = entry.getValue();
                                printFoundPersonalInformation(key, value);
                            }
                        }
                        break;
                }
            } else {
                exit = true;
            }
        }
    }

    private String getInput() {
        return reader.nextLine();
    }

    private void printPersonalInformation(HashMap<String, ArrayList<String>> personalValues) {
        ArrayList<String> values;

        if (personalValues.get("address").get(0).equals("address unknown")
                && personalValues.get("number").get(0).equals("not found")) {
            System.out.println("  not found");
        } else {
            values = personalValues.get("address");
            for (Object value : values) {
                if (value.equals("address unknown")) {
                    System.out.println("  address unknown");
                } else {
                    System.out.println("  address: " + value);
                }
            }

            values = personalValues.get("number");
            if (values.get(0).equals("not found")) {
                System.out.println("  phone number not found");
            } else {
                System.out.println("  phone numbers:");
                for (Object value : values) {
                    System.out.println("   " + value);
                }
            }
        }
    }

    private void printFoundPersonalInformation(String key, HashMap<String, ArrayList<String>> value) {
        System.out.println("\n " + key);
        printPersonalInformation(value);
    }
}
