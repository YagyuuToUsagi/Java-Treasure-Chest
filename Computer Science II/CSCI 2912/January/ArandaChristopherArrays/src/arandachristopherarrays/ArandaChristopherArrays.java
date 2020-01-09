package arandachristopherarrays;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author brianaranda
 */
public class ArandaChristopherArrays {

    public static void main(String[] args) throws IOException{
        Scanner input=new Scanner(new File("Input1.txt"));
        
        while(input.hasNext()){
            String line=input.nextLine();
            System.out.println(line);
        }
    }
    
}
