package objectserialdemo;

import java.io.*;
/**
 *
 * @author brianaranda
 */
public class ObjectSerialDemo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException
{
        ObjectOutputStream out= new ObjectOutputStream(
        new FileOutputStream("data.foo"));

        StoreSample obj1=new StoreSample("foo");
        System.out.println("obj1: "+obj1);
        out.writeObject(obj1);
        out.close();

        ObjectInputStream in= new ObjectInputStream(
        new FileInputStream("data.foo"));
        
        StoreSample obj2=(StoreSample)in.readObject(); 
    }
    
}
