package edu.hpu.caranda.program_counter;

import java.util.Scanner;
import java.io.*;

public class Program_Counter {

    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(new File("file.txt"));
        
            int a;
            
            a=in.nextInt(); //Reads interger from file
            ++a; // adds 1 to int a
            System.out.println(a); //prints out a
            
            PrintWriter line=new PrintWriter("file.txt"); //Opens a file
            
            line.println(a); //Writes the file
            
            line.close(); //Closes the file
        
    }
    
}
