/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package otherstrbuilddemo;

/**
 *
 * @author zhuyi
 */
public class OtherStrBuildDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final StringBuilder builder = new StringBuilder("I ate 100 blueberries!");
    System.out.println(builder);

    builder.deleteCharAt(8);
    System.out.println(builder);

    builder.delete(9, 13);
    System.out.println(builder);

    builder.setCharAt(6, '5');
    System.out.println(builder);
    }
}
