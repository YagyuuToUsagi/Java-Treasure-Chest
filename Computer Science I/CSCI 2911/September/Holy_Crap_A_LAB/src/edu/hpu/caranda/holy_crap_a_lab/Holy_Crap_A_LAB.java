package edu.hpu.caranda.holy_crap_a_lab;

import java.util.Scanner;
import java.io.*;

public class Holy_Crap_A_LAB {

    public static boolean isVowel(char c) {
        //Writing the vowel method
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static boolean isConsonant(char c) {
        //Writing the consonant method
        return !isVowel(c) && !Character.isDigit(c) && Character.isLetter(c);
    }

    public static void main(String[] args) throws IOException {
        //tells Scanner to open a file with a specific name

        Scanner inFile = new Scanner(new File("anthem_hi.txt"));
        //while there are more lines in a file
        int vowel = 0, consonant = 0;
        //declare int variables
        while (inFile.hasNext()) {
            //read in next line of file
            String oneLine = inFile.nextLine();
            //

            for (int i = 0; i < oneLine.length(); i++) {
                //Looping through the string


                //declare char variable named letter
                char letter = oneLine.charAt(i);
                //letter equals an individual character of s string

                if (isVowel(letter)) {
                    //finds if the character position is a letter
                    System.out.println(letter + " is a vowel.");
                    ++vowel;
                } else if (isConsonant(letter)) {
                    //finds if the character position is a letter
                    System.out.println(letter + " is a consonant.");
                    ++consonant;
                } else if (Character.isDigit(letter)) {
                    //finds if the character position is a digit
                    System.out.println(letter + " is a digit.");
                } else {
                    //finds if the character position is something else
                    System.out.println(letter + " is something else.");
                }
            }

        }
        System.out.println("End of the File. You have " + vowel + " vowel(s) and " + consonant + " consonant(s).");
        System.out.println("The vowel/consonant ratio is "+(double)vowel/(double)consonant+".");
        //prints out end of file
    }

}
