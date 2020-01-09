package arrays;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @authors Aranda, Christopher and Courteau, Lionel
 * @assignment CSCI 2912 Quiz 1 (Question 1)
 */

public class Arrays {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("Input1.txt")); //Reads the text file from the folder
        int r, c;
        String array;

        while (input.hasNext()) { //Goes through ech line of the file
            String line = input.nextLine();
            System.out.println(line);
            
            
        }
        
            input.close(); //Closes the file
            
        System.out.print("\nOutput: "); //Prints out input
    }

}
