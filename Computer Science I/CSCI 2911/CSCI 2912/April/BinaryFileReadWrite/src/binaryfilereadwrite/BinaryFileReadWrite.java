package binaryfilereadwrite;

import java.io.*;
import java.util.*;
/**
 *
 * @author brianaranda
 */
public class BinaryFileReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
                   
        DataOutputStream out=new DataOutputStream(
            new FileOutputStream("data.foo"));
        
        try{
            Random r= new Random();
            for (int i=0; i<10; i++){
                out.writeDouble(r.nextDouble());   
            }
            out.writeUTF("Brian");
        }finally{
            out.close();
        }
        
        DataInputStream in= new DataInputStream(
                new FileInputStream("data.foo"));
        
        try{
            for (int i=0; i<10; i++){
                System.out.println(in.readDouble());   
            }
            System.out.print(in.readUTF());
        }finally{
            in.close();
        }
        
        
    }
    
}
