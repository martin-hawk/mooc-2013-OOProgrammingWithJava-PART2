/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package farmsimulator;

/**
 *
 * @author Martynas Vanagas
 */
public class MilkingRobot implements Milkable {

    private BulkTank tank;

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        try {
            this.tank.addToTank(milkable.milk());
        } catch (Exception e) {
            System.err.println("The MilkingRobot hasn't been installed");
        }
    }

    @Override
    public double milk() {
        throw new UnsupportedOperationException("Not supported yet."); //Don't forget to implement this part of the method.
    }
}
