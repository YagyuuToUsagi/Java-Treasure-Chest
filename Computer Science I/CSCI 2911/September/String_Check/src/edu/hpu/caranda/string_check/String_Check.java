package edu.hpu.caranda.string_check;

import java.util.Scanner;

public class String_Check {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word, longword = null;

        int max = 0, i = 0;

        System.out.println("I'm a Word Checker. I'll check for the longest word amongst any of the five you enter.");

        while (i < 5) {
            System.out.println("Please enter a word:");
            word = input.nextLine();
            if (word.length() > max) {
                longword = word;
                max = word.length();
            }
            i++;
        }

        System.out.println("The longest word is " + longword + ".");

    }

}
