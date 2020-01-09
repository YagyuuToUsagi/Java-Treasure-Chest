package edu.hpu.caranda.game_of_dice;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author brianaranda
 */
public class Game_of_Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random die = new Random();

        // Roll the dice
        int die1 = die.nextInt(6) + 1;
        int die2 = die.nextInt(6) + 1;
        int sum = die1 + die2;

        int repeat = 0;
        String roll;

        System.out.println("Welcome to a Game of Dice! Here are the rules.");
        System.out.println("If your first roll is a  2, 3, or 12, you lose.");
        System.out.println("If your first roll is a 7 or 11, you automatically win the game!");
        System.out.println("If neither happens, you reach your point (First sum) and keep rolling.");
        System.out.println("If your new roll equals your point, you win!");
        System.out.println("If not, you lose. Are you ready?"); 
        System.out.print("Type in any key to roll the dice: ");
        roll = input.next();

        System.out.println(die1 + "+" + die2 + "=" + sum);
        if (sum == 7 || sum == 11) {
            System.out.print("Congratulations! You won on your first try!");
        }
        else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.print("Sorry, you lose!");
        } else {
            // Keeping track of point
            int point = sum;

            //Roll again
            System.out.print("Type in any key to roll again: ");
            roll = input.next();
            die1 = die.nextInt(6) + 1;
            die2 = die.nextInt(6) + 1;
            sum = die1 + die2;
            System.out.println(die1 + "+" + die2 + "=" + sum);

            while (sum != 7 && sum != point) {
                //Keeep rollin'
                System.out.print("Type in any key to roll again: ");
                roll = input.next();
                die1 = die.nextInt(6) + 1;
                die2 = die.nextInt(6) + 1;
                sum = die1 + die2;
                System.out.println(die1 + "+" + die2 + "=" + sum);

            }
            if (sum == point)
                System.out.print("WOOHOO! You won!");
            else
                System.out.print("Sorry, you lost...");
            
        }

    }

}
