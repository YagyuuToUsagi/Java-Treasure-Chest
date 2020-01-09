package edu.hpu.caranda.charfreq;

import java.util.Scanner;
import java.io.*;

public class CharFreq {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("anthem_en.txt"));

        int[] freq = new int[750];

        while (in.hasNext()) { //Loops reads the first line and the next etc.
            String sentence = in.nextLine();
            sentence = sentence.toLowerCase(); //Turns letters to lowercase
            for (int i = 0; i < sentence.length(); i++) { // Loop that goes through each character of the sentence
                char n = sentence.charAt(i);

                ++freq[(int) n];

            }

        }
        for (int i = 32; i < freq.length; i++) {

//            if (freq[i] != 0) { //Prints out non-zero frequencies
//                System.out.println((char) i + " " + freq[i]);
//            }
            if (Character.isLetter((char) i) && freq[i] != 0) { //Counts only letters, not punct
                System.out.println((char) i + " " + freq[i]);
            }

//            if (Character.isUpperCase((char)i) && freq[i]!=0) { //Counts only Uppercase letters
//                System.out.println((char) i + " " + freq[i]);
//            }
//
//            if (Character.isLowerCase((char)i) && freq[i]!=0) { //Counts only Lowercase letters
//                System.out.println((char) i + " " + freq[i]);
//            }
        }
    }

}
