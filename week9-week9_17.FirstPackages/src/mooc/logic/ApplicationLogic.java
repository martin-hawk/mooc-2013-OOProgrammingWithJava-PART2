/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author Martynas Vanagas
 */
public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            ui.update();
        }
    }
}
