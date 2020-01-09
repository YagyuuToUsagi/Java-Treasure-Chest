/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsearch2;

/**
 *
 * @author zhuyi
 */
public class StringSearch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // ................ 0123456789012345678901234567890
    final String str = "and a one and a two and a three";

    System.out.println("Locations of 'and', left to right:");

    int position = str.indexOf("and");
    while (position != -1) {
      System.out.println(position);
      position = str.indexOf("and", position + 1);
    }

    System.out.println();
    System.out.println("Locations of 'and', right to left:");

    position = str.lastIndexOf("and");
    while (position != -1) {
      System.out.println(position);
      position = str.lastIndexOf("and", position - 1);
    }
    }
}
