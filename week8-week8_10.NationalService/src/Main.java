
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        /*CivilService cs = new CivilService();
        System.out.println(cs.getDaysLeft());
        cs.work();
        System.out.println(cs.getDaysLeft());
        for (int i = 0; i < 360; i++) {
            cs.work();
        }
        System.out.println(cs.getDaysLeft());*/

        MilitaryService ms = new MilitaryService(90);
        System.out.println(ms.getDaysLeft());
        ms.work();
        System.out.println(ms.getDaysLeft());
        for (int i = 0; i < 100; i++) {
            ms.work();
        }
        System.out.println(ms.getDaysLeft());
    }
}
