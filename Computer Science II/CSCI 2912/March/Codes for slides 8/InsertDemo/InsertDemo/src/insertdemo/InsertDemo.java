/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertdemo;

/**
 *
 * @author zhuyi
 */
public class InsertDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      final StringBuilder builder 
              = new StringBuilder("We sold doughnuts");
    
    // 012345678
    // We sold doughnuts
    builder.insert(8, 12);
    
    // 01234567890
    // We sold 12doughnuts
    builder.insert(10, " ");
    
    // 012345678901234567890
    // We sold 12 doughnuts
    builder.insert(builder.length(), " for $15.95 dollors");
    
    System.out.println(builder);
    }
}
