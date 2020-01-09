package edu.hpu.caranda;

import java.util.Scanner;
/*************************
*So this is my program. Honestly, I've used part of my 
*previous textbook and the internet to build this program.
*I did all I can and tried to input everything I learned last semester.
* Though, I feel like I need some more assistance.
* I am really new to Java and I want to learn a lot in your class.
* So please bear with me. 
 **************************/
public class hw01q5 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        
        String name;
        int level;
        int convert;
        int number;
    
    System.out.print("Hey there! I'm Jeff! What's your name, kiddo? ");
    name=keyboard.nextLine();
    System.out.println("What up, "+name+"! On a scale of 1-10, how happy are you?");
    level=keyboard.nextInt();
    
        if(level==10)
        System.out.print("Holy crap, your happiness is off the charts!");
        else if (level>=6 && level<=9)
            System.out.print("That's cool.");
        else if(level>=1 && level<=4){
            System.out.print("Sucks. Hope you get better. Here's a Java comment in the form of a cat");
            System.out.println("");
            System.out.println("        ^          ^");
            System.out.println("       ^ ^        ^ ^");
            System.out.println("      ^   ^      ^   ^");
            System.out.println("     ^     ^^^^^^     ^");
            System.out.println("   ^                    ^");
            System.out.println("  ^                      ^");
            System.out.println(" ^                        ^");
            System.out.println("^    ======      ======    ^");            
            System.out.println("^    ======      ======    ^");            
            System.out.println("^                          ^");            
            System.out.println("^     _____ V  V _____     ^");            
            System.out.println("^        ___ VV ___        ^");
            System.out.println(" ^                         ^");
            System.out.println("  ^     u     u     u     ^");
            System.out.println("   ^     u   u u   u     ^");
            System.out.println("    ^     uuu   uuu     ^"); 
            System.out.println("     ^                ^");
            System.out.println("      ^^^^^^^^^^^^^^^^");
        }
            else if(level==5)
            System.out.print("Alright."); 
                  
        
    
    System.out.println("I feel like counting. What number would you like me to count up to?");
    number=keyboard.nextInt();
    System.out.println("Alrighty! Up to number"+number+" it is!");
    
    for(int i=0; i<=number; i++)    
    {
        System.out.println(""+i+"");
    }
    System.out.print("Here you go! Up to "+number+"! Have a nice day!");
    }
        }
       

