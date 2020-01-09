/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hpu.caranda.Sting2int;

import java.util.Scanner;

public class String2int {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number;
        char numberChar;
        int subtract;
        int num2;


        System.out.print("Please enter a number: ");
        number = input.nextLine();
        System.out.print("\n");        

        for (int i = 0; i < number.length(); i++) {          
            numberChar=number.charAt(i); //Index goes through the string number
            num2=(int)numberChar; //Typecastes the character index to an int 
            subtract=numberChar-'0'; //Subtracts the char value '0' from the typecasted int
            System.out.print(numberChar);  //Prints out Int value of string         
        }

    }

}
