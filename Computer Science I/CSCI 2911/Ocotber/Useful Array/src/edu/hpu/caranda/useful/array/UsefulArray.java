package edu.hpu.caranda.useful.array;

import java.util.Scanner;

public class UsefulArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length_array, index, numeric;
        String descision="";
        boolean setup = true;

        System.out.print("How long do you want your array to be? ");
        length_array = in.nextInt();

        int[] array = new int[length_array];

        System.out.println("You have set the length of your array to be " + length_array + ".");
        System.out.println("Would you like to assign any value to a certain index?\n(Remember that your first index is 0) "+descision);
        descision = in.nextLine();

        
            if (descision.equals("Yes|yes|y|Y")) {
                setup=true;
                System.out.println("Which index would you like to edit?");
                index = in.nextInt();
                System.out.println("What numeric value would you like to assign to it?");
                numeric = in.nextInt();
                
                array[index]=numeric;
                
                System.out.println("Your assigned the number "+numeric+" to index"+index+".");
                
        }
            else{
                System.out.println("Ok, here is what you have:");
                
                for (int i=0; i<array.length; i++){
                    System.out.println((char)array[index]);
                    
                }
            }

    }

}
