/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hpu.caranda;

import java.util.Scanner;

public class awesomehw2q5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String backwards = "";
        String word;
        int count;
        int sum;
        char first;
        char last;

        System.out.print("Welcome to Know The Word! Please type in a word for interesting things: ");
        word = keyboard.nextLine();
        System.out.print("\n");

        count = word.length();
        first = word.charAt(0);
        last = word.charAt(word.length() - 1);
        sum = (int) (first + last);

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        System.out.print("\n");

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + "\t");
        }

        System.out.print("\n\n");

//        for (int i = 0; i < word.length(); i++) {    // Problem here.
//            System.out.print(word.charAt(i) + "\t"); //Goal: Print the user input
//            word += word.toUpperCase();              //in uppercase tab.
//        }                                            //(Ex. D U D E)

        for (int i = word.length() - 1; i >= 0; i--) {
            backwards += word.charAt(i);
        }

        System.out.println("\nThere are " + count + " characters in this word.");
        System.out.println("\nThe first character of this word is " + first + ".");
        System.out.println("\nThe last character of this word is " + last + ".");
        System.out.println("\n" + backwards + " is " + word + " backwards.");
        System.out.println("\n" + sum + " is the sum of all " + count + " words.");

    }

}
