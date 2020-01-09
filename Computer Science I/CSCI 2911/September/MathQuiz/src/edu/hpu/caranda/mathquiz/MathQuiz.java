/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hpu.caranda.mathquiz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brianaranda
 */
public class MathQuiz {

    public static void main(String[] args) {
        Random bag = new Random();
        Scanner input = new Scanner(System.in);

        String name;
        String operation;
        int response;
        int right = 0;
        int wrong = 0;

        System.out.print("Welcome to Math Quizzer! What is your name? ");
        name = input.nextLine();
        System.out.println("Alright, " + name + ". Would you like to be asked addition or subtraction problems?");
        System.out.println("Press + for addition, - for subtraction, * for multiplication, or / for division.");
        operation = input.nextLine();
        while(!operation.equals("+")&&!operation.equals("-")&&!operation.equals("*")&&!operation.equals("/")){
            System.out.println("I couldn't quite catch that. Which operation would you like to do?");
            operation=input.nextLine();
        }
        System.out.println("I will ask you ten random math problems. Answer as many questions correctly as you can.");

        System.out.println("You got this! Let's get started!");

        if (operation.equals("+")) {
            for (int i = 0; i < 10; i++) {
                int n1 = bag.nextInt(9);
                int n2 = bag.nextInt(9);

                System.out.print(n1 + "+" + n2 + "=");
                response = input.nextInt();
                if (response == n1 + n2) {
                    System.out.println("Correct!");
                    right++;
                } else {
                    System.out.println("Sorry, that's wrong, but keep going!");
                    wrong++;
                }

            }
        }
        if (operation.equals("-")) {
            for (int i = 0; i < 10; i++) {
                int n1 = bag.nextInt(9);
                int n2 = bag.nextInt(9);

                System.out.print(n1 + "-" + n2 + "=");
                response = input.nextInt();
                if (response == n1 - n2) {
                    System.out.println("Correct!");
                    right++;
                } else {
                    System.out.println("Sorry, that's wrong, but keep going!");
                    wrong++;
                }
            }
        }
        if (operation.equals("*")) {
            for (int i = 0; i < 10; i++) {
                int n1 = bag.nextInt(9);
                int n2 = bag.nextInt(9);

                System.out.print(n1 + "*" + n2 + "=");
                response = input.nextInt();
                if (response == n1 * n2) {
                    System.out.println("Correct!");
                    right++;
                } else {
                    System.out.println("Sorry, that's wrong, but keep going!");
                    wrong++;
                }

            }
        }
        if (operation.equals("/")) {
            for (int i = 0; i < 10; i++) {
                int n1 = bag.nextInt(9);
                int n2 = bag.nextInt(9)+1;
                n1=n1*n2;
                
                System.out.print(n1 + "/" + n2 + "=");
                response = input.nextInt();
                if (response == n1 / n2) {
                    System.out.println("Correct!");
                    right++;
                } else {
                    System.out.println("Sorry, that's wrong, but keep going!");
                    wrong++;
                }

            }
        }
         
           
        
        System.out.print("You got " + right + " questions right and " + wrong + " wrong.");

    }
}
