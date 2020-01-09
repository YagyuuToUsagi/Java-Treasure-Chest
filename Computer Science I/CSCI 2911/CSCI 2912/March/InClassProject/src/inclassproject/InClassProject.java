package inclassproject;

import java.util.Scanner;
import java.io.*;


public class InClassProject {

    public static void main(String[] args)throws IOException{
        Scanner reader=new Scanner(new File("sample.txt"));
        PrintWriter writer=new PrintWriter("output.txt");
        StringBuilder builder=new StringBuilder();
        int position, count=0;
        String linefile;
        
        
        while(reader.hasNext()){
            String word="";
            count++;
            linefile=reader.nextLine();
            
            
            
            System.out.println(linefile);
                 
             }
            
            
            
            
        }
    }
    

