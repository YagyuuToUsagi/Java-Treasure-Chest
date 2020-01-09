package edu.hpu.caranda.jan_ken_po;

import java.util.Scanner;
import java.util.Random;

public class Jan_Ken_Po {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random bag = new Random();

        //Variable declaration
        String move;

        //Instructions and asks for user's move
        System.out.println("Let's play じゃんけんぽ(Jan Ken Po)! Technically rock paper scissors.");
        System.out.println("Type in r for rock, p for paper, and s for scissors. Alright, let's play!");

        boolean game_over = false;
        while (!game_over) {
            int c = bag.nextInt(3) + 1;
            String compChoice="";
            if(c==1){
                compChoice="Rock";
            }
            else if(c==2){
                compChoice="Paper";
            }
            else if(c==3){
                compChoice="Scissors";
            }

            System.out.print("じゃんけんぽ！(Jan Ken Po!)");
            move = input.nextLine();
            
            System.out.println("Computer makes "+compChoice+", you made a "+move+"!");

            if (move.equals("r") && c == 2) {
                System.out.println("You lost! ");

            } else if (move.equals("r") && c == 3) {
                System.out.println("おめでとう! You won!");
            } else if (move.equals("p") && c == 1) {
                System.out.println("おめでとう! You won!");
            } else if (move.equals("p") && c == 3) {
                System.out.println("You lost!");
            } else if (move.equals("s") && c == 1) {
                System.out.println("You lost!");
            } else if (move.equals("s") && c == 2) {
                System.out.println("おめでとう! You won!");
            } else {
                System.out.print("あいこでしょ。(It's a tie!) ");

            }
            System.out.println("If you'd like to play again, press Enter. If not, type in no.");
            move = input.nextLine();
            if (move.matches("No|no|N|n")) {
                game_over = true;    
            }
        }

    }

}
