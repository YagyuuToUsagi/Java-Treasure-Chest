package arandachristopher1;

import java.util.Scanner;
import java.io.*;

/**
 * @description
 *
 * @author Christopher, Aranda
 * @assignment CSCI 2912 Assignment 1
 * @date January 28, 2017
 */
public class ArandaChristopher1 {

    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("Input1.txt")); //Reads the text file from the folder
        int row = file.nextInt(); //Initializes rows
        int column = file.nextInt(); //Initializes columns

        int[][] array = new int[row][column];

        while (file.hasNext()) { //Goes through each line of the file

            for (int r = 0; r < array.length; r++) { //Goes through rows in the text file

                int value = array[r][0]; //Declare an int data type called value initialized to 0

                {
                    for (int c = 0; c < array[r].length; c++) {//Goes through columns in the text file

                        array[r][c] = file.nextInt(); //Fills in each array index with 
                        //the int value of 

                        if (array[r][c] < value) { //Checks if the first value of the row
                                                   //is less than the current int value.

                            value = array[r][c]; //Sets value to the current value if the if statement is true
                        }

                    }
                            System.out.print(value); //Displays value 
                }

            }
        }
    }

}
