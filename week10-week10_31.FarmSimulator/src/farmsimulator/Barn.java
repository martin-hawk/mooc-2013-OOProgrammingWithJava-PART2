/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Martynas Vanagas
 */
public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        robot.setBulkTank(this.tank);
    }

    public void takeCareOf(Cow cow) {
        try {
            this.robot.milk(cow);
        } catch (Exception e) {
            System.err.println("The MilkingRobot hasn't been installed");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        try {
            for (Cow cow : cows) {
                this.robot.milk(cow);
            }
        } catch (Exception e) {
            System.err.println("The MilkingRobot hasn't been installed");
        }
    }

    @Override
    public String toString() {
        return this.tank.toString(); //Don't forget to implement this part of the method and return the value.
    }
}
