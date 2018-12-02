
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class PhoneBook {

    private HashMap<String, HashSet<String>> pb = new HashMap<String, HashSet<String>>();
    private HashMap<String, HashSet<String>> ab = new HashMap<String, HashSet<String>>();

    public void addNewPhone(String name, String number) {
        if (this.pb.keySet().contains(name)) {
            this.pb.get(name).add(number);
        } else {
            this.pb.put(name, new HashSet<String>());
            this.pb.get(name).add(number);
        }
    }

    public void addNewAddress(String name, String street, String city) {
        String address = street + " " + city;
        if (this.ab.keySet().contains(name)) {
            this.ab.get(name).add(address);
        } else {
            this.ab.put(name, new HashSet<String>());
            this.ab.get(name).add(address);
        }
    }

    public ArrayList<String> getNumberByName(String name) {
        ArrayList<String> returnValues = new ArrayList<String>();
        try {
            HashSet<String> phoneNumbers = pb.get(name);
            for (String phoneNumber : phoneNumbers) {
                returnValues.add(phoneNumber);
            }
        } catch (Exception e) {
            returnValues.add("not found");
        }
        return returnValues;
    }

    public ArrayList<String> getNameByNumber(String phoneNumber) {
        ArrayList<String> returnValues = new ArrayList<String>();
        try {
            for (String name : pb.keySet()) {
                HashSet<String> phoneNumbers = pb.get(name);
                if (phoneNumbers.contains(phoneNumber)) {
                    returnValues.add(name);
                } else {
                    returnValues.add("not found");
                }
            }
        } catch (Exception e) {
            returnValues.add("not found");
        }
        return returnValues;
    }

    public HashMap<String, ArrayList<String>> getPersonalInformation(String name) {
        HashMap<String, ArrayList<String>> returnValues = new HashMap<String, ArrayList<String>>();
        try {
            HashSet<String> addresses = ab.get(name);
            for (String address : addresses) {
                if (returnValues.containsKey("address")) {
                    returnValues.get("address").add(address);
                } else {
                    returnValues.put("address", new ArrayList());
                    returnValues.get("address").add(address);
                }
            }
        } catch (Exception e) {
            returnValues.put("address", new ArrayList());
            returnValues.get("address").add("address unknown");
        }

        ArrayList<String> numbers = getNumberByName(name);
        returnValues.put("number", numbers);

        return returnValues;
    }

    public void deletePersonalInformation(String name) {
        if (pb.containsKey(name)) {
            pb.remove(name);
        }
        if (ab.containsKey(name)) {
            ab.remove(name);
        }
    }

    public LinkedHashMap<String, HashMap<String, ArrayList<String>>> filteredListing(String keyword) {
        LinkedHashMap<String, HashMap<String, ArrayList<String>>> orderedInformation = new LinkedHashMap<String, HashMap<String, ArrayList<String>>>();

        Set<String> tempKeySet = this.pb.keySet();
        List<String> keysList = new ArrayList<String>();

        for (String string : tempKeySet) {
            if (string.contains(keyword)) {
                keysList.add(string);
            }
        }

        tempKeySet = this.ab.keySet();
        for (String string : tempKeySet) {
            if (string.contains(keyword)) {
                keysList.add(string);
            }
            if (ab.get(string).toString().contains(keyword)) {
                keysList.add(string);
            }
        }

        List<String> noDuplicates = new ArrayList<String>(new HashSet<String>(keysList));
        Collections.sort(noDuplicates);

        for (String string : noDuplicates) {
            orderedInformation.put(string, getPersonalInformation(string));
        }

        return orderedInformation;
    }
}
