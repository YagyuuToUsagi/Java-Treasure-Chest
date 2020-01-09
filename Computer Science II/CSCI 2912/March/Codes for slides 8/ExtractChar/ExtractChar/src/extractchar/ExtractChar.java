/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package extractchar;

/**
 *
 * @author zhuyi
 */
public class ExtractChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final String text = "The Golden Rule";

    final char[] gold = new char[7];
    text.getChars(4, 10, gold, 1);

    System.out.println("Golden Chars:");
    char ch;
    for (int i = 0; i < gold.length; i++)
    { ch=gold[i];
      System.out.println("'" + ch + "'");
    }
    }
}
