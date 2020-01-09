/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsearch1;

/**
 *
 * @author zhuyi
 */
public class StringSearch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String str = "Long long ago, long long ago";
    if (str.startsWith("Long"))
      System.out.println("The string starts with 'Long'.");
    else
      System.out.println("The string does not start with 'Long'.");

    if (str.endsWith("Ago"))
      System.out.println("The string ends with 'Ago'.");
    else
      System.out.println("The string does not end with 'Ago'.");
    }
}
