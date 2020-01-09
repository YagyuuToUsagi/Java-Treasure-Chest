package floating_sort;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Aranda, Christopher
 * @assignment CSCI 2912 Assignment 3
 * @DueDate March 12th, 2017 11:59 PM
 */
public class Floating_Sort {

    public static void main(String[] args) throws IOException {
        boolean end = false; //Boolean value
                             //determines when the program ends or not.

//        boolean invaid=false; //Determines if the user 
        while (end==false) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please input the file which contains numbers "
                    + "you want to sort."); //Asks user for file input name
            String filename = keyboard.nextLine(); //String input variable

            Scanner file = new Scanner(new File("" + filename + ""));

            while(file.hasNext()){
                
                System.out.println(file.nextLine());
                
                }
            }
            
//            {
//
//                else {while (invalid=true) {
//                    System.out.println("Invalid command-line arguments.");
//                    System.out.println("Please input the file which contains numbers"
//                            + "you want to sort.");
//                    
//                }
//            }

        }
    }

//    static void mergeSort(float[] values) {
//        
//
//    }

