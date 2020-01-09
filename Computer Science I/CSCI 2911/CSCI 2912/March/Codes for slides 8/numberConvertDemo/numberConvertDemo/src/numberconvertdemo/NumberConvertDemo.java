/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconvertdemo;

/**
 *
 * @author zhuyi
 */
public class NumberConvertDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int i = 123;
    System.out.print(i + "'s binary value is: ");
    System.out.println(Integer.toBinaryString(i));
    System.out.print(i + "'s octal value is:  ");
    System.out.println(Integer.toOctalString(i));
    System.out.print(i + "'s hex value is:    ");
    System.out.println( Integer.toHexString(i));// TODO code application logic here
    }
}
