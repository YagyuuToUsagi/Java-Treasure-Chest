/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringvalue;

/**
 *
 * @author zhuyi
 */
public class StringValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Value of a boolean:    " + String.valueOf(true));
    System.out.println("Value of an integer:   " + String.valueOf(34));
    System.out.println("Value of an integer:   " + 34);
    System.out.println("Value of a double:     " + 3.4);
    System.out.println("Value of a char:       " + String.valueOf('J'));
    final char[] chars = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    System.out.println("Value of a char array: " + chars);
    System.out.println("Value of a char array: " + String.valueOf(chars, 2, 6));
    }
}
