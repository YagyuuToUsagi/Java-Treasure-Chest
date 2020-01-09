/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package changecharacter;

/**
 *
 * @author zhuyi
 */
public class ChangeCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final char[] array = { 'a', 'b', 'C', 'D', 'e', 'f', 'G', '2', };
    for(int i = 0; i < array.length; i++)
      System.out.print(Character.toLowerCase(array[i]) + " ");

    System.out.println();
    for(int i = 0; i < array.length; i++)
      System.out.print(Character.toUpperCase(array[i]) + " ");
      System.out.println();
    }
}
