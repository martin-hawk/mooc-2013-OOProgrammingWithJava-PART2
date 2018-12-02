
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("\\:D/");
        printWithSmileys("87.");

        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        if (characterString.length() % 2 == 1) {
            characterString += " ";
        }

        printHeaderFooter(characterString.length());

        System.out.println(":) " + characterString + " :)");

        printHeaderFooter(characterString.length());
    }

    private static void printHeaderFooter(int lenght) {
        for (int i = 0; i < (lenght + 6) / 2; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }
}
