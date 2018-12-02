/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package containers;

/**
 *
 * @author Martynas Vanagas
 */
public class ProductContainer extends Container {

    private String productName;

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public String toString() {
        return getName() + ": " + super.toString(); //Don't forget to implement this part of the method and return the value.
    }

}
