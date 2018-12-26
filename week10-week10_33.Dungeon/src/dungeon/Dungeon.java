/*
 * This program code is written by Martynas Vanagas.
 * This code is to be used for learning purposes.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Martynas Vanagas
 */
public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    Player player = new Player();
    private ArrayList<Vampire> vampiresList = new ArrayList<Vampire>();
    Random random = new Random();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        if (length > 0 && height > 0 && vampires > 0 && moves > 0) {
            if (length >= height) {
                this.length = length;
                this.height = height;
            }
            this.vampires = vampires;
            for (int i = 0; i < this.vampires; i++) {
                Vampire vampire = new Vampire(random.nextInt(this.length), random.nextInt(this.height));
                this.vampiresList.add(vampire);
            }
            this.moves = moves;
        }
        this.vampiresMove = vampiresMove;
    }

    public void run() {
        boolean indicator = true;
        Scanner reader = new Scanner(System.in);
        String readValue = "";
        ArrayList<Figure> playersToBeRemoved = new ArrayList<Figure>();
        while (indicator) {
            //Print the moves left
            System.out.println(this.moves);
            System.out.println("");

            //Print the statistics
            System.out.println(player);
            for (Figure figure : vampiresList) {
                System.out.println(figure);
            }

            System.out.println("");
            // Print the board
            printBoard();

            // Get moves sequence
            readValue = reader.nextLine();
            player.move(readValue, this.length, this.height); // Move @

            this.moves--; // Decrease moves
            if (this.moves <= 0) {
                System.out.println("YOU LOSE");
                indicator = false;
            } else {
                for (Vampire vampire : vampiresList) { // Check if @ kill v
                    if (this.player.compareCoords(vampire)) { // If coordinates are equal
                        playersToBeRemoved.add(vampire); // Add v to the remove list
                    }
                }

                vampiresList.removeAll(playersToBeRemoved); // Remove the players (delete killed v from playersList)
                playersToBeRemoved.clear();

                // Check if WIN
                if (vampiresList.isEmpty()) {
                    System.out.println("YOU WIN");
                    indicator = false;
                } else if (vampiresMove) { // If v can move
                    for (Vampire vampire : vampiresList) {
                        char[] directions = {'a', 'd', 's', 'w'}; // Get next move direction for v
                        int direction = random.nextInt(directions.length);

                        // Before move v, check if v don't step into a place already occupied by another v
                        boolean checkMove = true;
                        for (Vampire v : vampiresList) {
                            if (vampire.checkMove(v)) {
                                checkMove = false;
                                break;
                            }
                        }
                        if (checkMove) {
                            vampire.move(directions[direction], this.length, this.height); // Move all v
                        }
                    }
                }
                // Repeat printBoard
            }
        }
    }

    private String getPointValue(int dx, int dy) {
        String pointValueToReturn = "";
        ArrayList<Figure> tempList = new ArrayList<Figure>();
        tempList.add(player);
        for (Vampire vampire : this.vampiresList) {
            tempList.add(vampire);
        }
        for (Figure figure : tempList) {
            if (figure.getX() == dx && figure.getY() == dy) { // Check if the player is in particular place
                pointValueToReturn = figure.getType();
                break; // If found, stop processing
            } else {
                pointValueToReturn = "."; // If not found, then return "."
            }
        }
        return pointValueToReturn;
    }

    private String getLine(int lineNumber) {
        String lineToReturn = "";
        for (int i = 0; i < this.length; i++) { // For lenght of a Board form a line
            lineToReturn += getPointValue(i, lineNumber); // Get the point value (".", "@", "v")
        }
        return lineToReturn;
    }

    private void printBoard() {
        for (int i = 0; i < this.height; i++) { // For height of a Board print a line
            System.out.println(getLine(i));
        }
    }
}
