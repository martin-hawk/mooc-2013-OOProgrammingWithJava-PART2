package containers;

/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.history = new ContainerHistory();
        this.history.add(initialVolume);
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.history.add(super.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double lastVolume = this.getVolume();
        super.takeFromTheContainer(amount);
        this.history.add(this.getVolume());
        return lastVolume - this.getVolume();
    }

    public String history() {
        return this.history.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+history());
        System.out.println("Greatest product amount: "+this.history.maxValue());
        System.out.println("Smallest product amount: "+this.history.minValue());
        System.out.println("Average: "+this.history.average());
        System.out.println("Greatest change: "+this.history.greatestFluctuation());
        System.out.println("Variance: "+this.history.variance());
    }
}
