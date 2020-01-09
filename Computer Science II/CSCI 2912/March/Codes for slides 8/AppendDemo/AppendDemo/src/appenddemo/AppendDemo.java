/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appenddemo;

/**
 *
 * @author zhuyi
 */
public class AppendDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    final StringBuilder builder = new StringBuilder();
    builder.append("We sold ");
    builder.append(12);
    builder.append(" doughnuts for $");
    builder.append(15.95);
    builder.append(new char[] { ' ', 'd', 'o', 'l', 'l', 'o', 'r', 's' });

    final String text = builder.toString();
    System.out.println(text);
    }
}
