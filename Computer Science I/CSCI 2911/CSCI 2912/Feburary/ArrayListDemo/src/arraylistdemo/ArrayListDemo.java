package arraylistdemo;

import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {
       
        ArrayList<String>listString=new ArrayList<>();
        ArrayList<Integer>listInt=new ArrayList<>();
        
        listString.add("Alpha");
        listString.add("Bravo");
        listString.add("Charlie");
        listString.add("Delta");
        listString.add("Echo");
        
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        
        System.out.println(listString+"\n"+listInt);
        
        Integer b=7;
        
        System.out.println(b);
        
        //----------------------------------------------------------------------
        
        
    }
    
}
