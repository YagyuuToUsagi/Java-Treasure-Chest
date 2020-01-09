package edu.hpu.caranda.holycrapanawesomeprogram;

import java.util.Scanner;
import java.util.Random;

public class HolyCrapAnAwesomeProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random move = new Random();

        boolean game_over = false;
        int playerLife = 10, compLife = 10;
        
        System.out.println("I challenge you to a knife fight! Fight me with numbers.");
        System.out.println("Pick a number from 1-10. If it's greater than my number, I stuck you!");
        System.out.println("If not, you struck me!");
       
        while (!game_over) {

            System.out.println("Fight me bro! Pick a number from 1-10. ");
            int attack = input.nextInt();


            int compMove = move.nextInt(10) + 1;

            System.out.println("\nYou typed in " + attack + ". The computer got a " + compMove + ".");

            if (attack < compMove) {
                System.out.println("You got struck!");
                System.out.println("You have " + playerLife + " hp left! The computer has " + compLife + " hp left!");
                playerLife -= 1;
            } else if (attack > compMove) {
                System.out.println("Damn, I got struck!");
                System.out.println("You have " + playerLife + " hp left! The computer has " + compLife + " hp left!");
                compLife -= 1;
            } else {
                System.out.println("Whoa! Our knives struck each other. But that won't stop me!");
            }


        }
            if (playerLife == 0) {
                game_over = true;
                System.out.println("おまえわもうしんでいる(You're already dead.)。 Computer wins!");
            } if (compLife==0) {
                game_over = true;
                System.out.println("Yo fam, you killed me. You win! I'll be back!!!");
            }

    }

}
