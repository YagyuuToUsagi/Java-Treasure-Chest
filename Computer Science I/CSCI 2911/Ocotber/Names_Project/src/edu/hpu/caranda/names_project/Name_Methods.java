package edu.hpu.caranda.names_project;

import java.util.Scanner;
import java.io.*;

public class Name_Methods {
    
    String[] names;
    int nwords;
    
    public Name_Methods(int size){
        
    this.names=new String [size];
    this.nwords=0;
    
    }
    
    public void read(String filename)throws IOException{
        Scanner in=new Scanner(new File(filename)); //Opens file
        PrintWriter out=new PrintWriter(new File ("out.txt")); //Creats file out.txt

        while(in.hasNext()){//Reads the file
            
            String name=in.nextLine();
            out.println(name);
            names[nwords]=name;
            nwords++;
        }
        in.close();//Closes the file
        out.close();//Closes the out.txt
    }
    
    public int find_index(String name){
        for(int i=0; i<nwords;++i){
            if(names [i].equals(name)){
               return i; 
            } 
           
        }
        return -1; 
    }
    
    public int size() {
        return nwords;
    }
    
    public void alpha_order(){        
        for(int i=0;i<names.length; ++i){
        String a;
        String b;
        String temp;
            temp=a;
            a=b;
            b=temp;
        }
    }
    
    
    
//    public String name_sort(){//sort method
//    
//    }
    
}
