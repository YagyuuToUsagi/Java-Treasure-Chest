package edu.hpu.caranda.my_own_program;

import java.io.*;
import java.util.Scanner;

public class My_Own_Program {

    public static double _double_(double x){
        return x*x;
    }    
    public static double cube(double x){
        return x*x*x;
    }

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Type a number.");
        number=input.nextInt();
        
        double multiply=_double_(number);
        System.out.println(number+"x"+number+"="+multiply);        
        double cubed=cube(number);
        System.out.println(number+"x"+number+"x"+number+"="+cubed);
        
        }

    }

