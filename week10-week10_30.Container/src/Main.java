
import containers.ProductContainerRecorder;
import containers.ProductContainer;

public class Main {

    public static void main(String[] args) {
        // write test code here
//        ProductContainer juice = new ProductContainer("Juice", 1000.0);
//        juice.addToTheContainer(1000.0);
//        juice.takeFromTheContainer(11.3);
//        System.out.println(juice.getName()); // Juice
//        System.out.println(juice);           // volume = 988.7, free space 11.3

//        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
//        juice.takeFromTheContainer(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToTheContainer(1.0);
//        System.out.println(juice);           // Juice: volume = 989.7, free space 10.3
//
//        System.out.println(juice.history()); // [1000.0]
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        juice.addToTheContainer(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
    }
}
