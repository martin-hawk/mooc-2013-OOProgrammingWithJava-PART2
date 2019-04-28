package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        // test your program here
        //        PersonalBoard board = new PersonalBoard(7, 5);
        //
        //        board.turnToLiving(2, 0);
        //        board.turnToLiving(4, 0);
        //
        //        board.turnToLiving(3, 3);
        //        board.turnToLiving(3, 3);
        //
        //        board.turnToLiving(0, 2);
        //        board.turnToLiving(1, 3);
        //        board.turnToLiving(2, 3);
        //        board.turnToLiving(3, 3);
        //        board.turnToLiving(4, 3);
        //        board.turnToLiving(5, 3);
        //        board.turnToLiving(6, 2);
        //
        //        GameOfLifeTester tester = new GameOfLifeTester(board);
        //        tester.play();
        //        PersonalBoard board = new PersonalBoard(3, 3);
        //        board.initiateRandomCells(0.5);
        //
        //        GameOfLifeTester tester = new GameOfLifeTester(board);
        //        tester.play();
        //        PersonalBoard board = new PersonalBoard(7, 5);
        //
        //        board.turnToLiving(0, 1);
        //        board.turnToLiving(1, 0);
        //        board.turnToLiving(1, 2);
        //        board.turnToLiving(2, 2);
        //        board.turnToLiving(2, 1);
        //
        //        System.out.println("Neighbours alive (0,0): " + board.getNumberOfLivingNeighbours(0, 0));
        //        System.out.println("Neighbours alive (1,1): " + board.getNumberOfLivingNeighbours(1, 1));
        PersonalBoard board = new PersonalBoard(100, 100);
        board.initiateRandomCells(0.7);

        Simulator simulator = new Simulator(board);
        simulator.simulate();
    }
}
