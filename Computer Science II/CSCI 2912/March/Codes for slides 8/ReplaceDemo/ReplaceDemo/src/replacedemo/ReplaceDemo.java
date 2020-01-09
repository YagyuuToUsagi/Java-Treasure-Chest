/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package replacedemo;

/**
 *
 * @author zhuyi
 */
public class ReplaceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           final StringBuilder builder;
    // ......................... 012345678901234567890123456789012
    builder = new StringBuilder("We moved from Chicago to Atlanta.");
   System.out.println(builder);
    builder.replace(14, 21, "Honolulu");
    System.out.println(builder);
    builder.replace(26, 33, "New York");
    //builder.replace(builder.length()-8, builder.length()-1, "New York");
     System.out.println(builder);
    }
}
