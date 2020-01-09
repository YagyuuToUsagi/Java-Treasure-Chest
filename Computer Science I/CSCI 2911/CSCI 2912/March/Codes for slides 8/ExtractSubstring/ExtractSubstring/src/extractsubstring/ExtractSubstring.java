/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package extractsubstring;

/**
 *
 * @author zhuyi
 */
public class ExtractSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final String text = "The Golden2Rule";
    
    final String golden = text.substring(4, 10);
    final String rule = text.substring(11);

    System.out.println("Golden: " + golden);
    System.out.println("Rule:   " + rule);// TODO code application logic here
    }
}
