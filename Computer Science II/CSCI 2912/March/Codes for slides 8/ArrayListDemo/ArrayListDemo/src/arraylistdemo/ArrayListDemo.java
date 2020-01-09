/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;
import java.util.ArrayList;


public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     final ArrayList<Integer> list = new ArrayList<Integer>();
     //final ArrayList<int> list = new ArrayList<int>();
     //final ArrayList<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
     System.out.println(list);

    }
}
