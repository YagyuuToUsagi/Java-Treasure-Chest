package edu.hpu.caranda;

import java.util.Scanner;

public class LabAssignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message;
        String shifted = "";
        int rot13;
        int encrypt;
        char letter;

        System.out.print("Print the message to encode: ");
        message = input.nextLine();
        System.out.print(message + "\n\n");

        for (int i = 0; i < message.length(); i++) {
            letter = message.charAt(i);
            if (letter >= 'a' && letter <= 'm') {
                rot13 = letter + 13;
                shifted += (char) rot13;
            } else if (letter >= 'n' && letter <= 'z') {
                rot13 = letter - 13;
                shifted += (char) rot13;
            } else if (letter >= 'A' && letter <= 'M') {
                rot13 = letter + 13;
                shifted += (char) rot13;
            } else if (letter >= 'N' && letter <= 'Z') {
                rot13 = letter - 13;
                shifted += (char) rot13;
            } else {
                shifted += letter;
            }
        }
        System.out.println(shifted + "\n");
        System.out.println(message);
    }

}
