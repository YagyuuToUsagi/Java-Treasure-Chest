package objectserialdemo;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author brianaranda
 */
public class StoreSample implements Serializable{
    ArrayList<Integer> list=new ArrayList<>();
    String name;
    
    public StoreSample(String name){
        System.out.println("Constructor!");
        this.name=name;
        for (int i=0; i<10; i++){
            this.list.add(Integer.valueOf(i));
        }
    }
    
    public String toString(){
        return "name = ["+this.name+"]; list = "+this.list;
    }
}
