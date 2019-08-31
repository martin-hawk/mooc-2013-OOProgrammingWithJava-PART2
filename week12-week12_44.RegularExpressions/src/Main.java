
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String string = reader.nextLine();
        if (clockTime(string)) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }

    }

    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u|y|ä|ö)*");
    }

    public static boolean clockTime(String string) {
        Boolean check = false;
        String hours = null, minutes = null, seconds = null;
        if (string.matches("\\d\\d:\\d\\d:\\d\\d")) {
            hours = string.split(":")[0];
            minutes = string.split(":")[1];
            seconds = string.split(":")[2];
            if (hours.matches("(0[0-9]|1[0-9]|2[0-3])")) {
                if (minutes.matches("(0[0-9]|[1-5][0-9])")) {
                    if (seconds.matches("(0[0-9]|[1-5][0-9])")) {
                        check = true;
                    }
                }
            }
        }
        return check;
    }
}
