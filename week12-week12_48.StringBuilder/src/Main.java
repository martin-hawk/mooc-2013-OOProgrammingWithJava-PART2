
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t.length; i++) {
            if ((i + 1) % 4 == 0) {
                if ((i + 1) == t.length) {
                    sb.append(t[i]).append("\n"); // If element is last element
                } else { // If element is last in a row, but not last element
                    sb.append(t[i]).append(",\n");
                }
            } else if ((i + 1) % 4 == 2 || (i + 1) % 4 == 3) { // Add 2nd and 3rd elements, which are equal to last element
                sb.append(t[i]);
                if ((i + 1) == t.length) {
                    sb.append("\n");
                } else {
                    sb.append(", "); // Or is not equal to last element
                }
            } else if ((i + 1) % 4 == 1) { // Build new line and first element
                sb.append(" ").append(t[i]);
                if ((i + 1) == t.length) {
                    sb.append("\n"); // If element equal to last element
                } else {
                    sb.append(", "); // If element not equal to last element
                }
            }
        }
        return "{\n" + sb + "}\n";
//    MODEL SOLUTION
//    public static String build(int[] t) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("{");
//
//        for (int i = 0; i < t.length; i++) {
//            if (i % 4 == 0) {
//                sb.append("\n ");
//            }
//
//            sb.append(t[i]);
//
//            if (i != t.length - 1) {
//                sb.append(", ");
//            }
//        }
//        sb.append("\n}");
//        return sb.toString();
//    }
    }
}
