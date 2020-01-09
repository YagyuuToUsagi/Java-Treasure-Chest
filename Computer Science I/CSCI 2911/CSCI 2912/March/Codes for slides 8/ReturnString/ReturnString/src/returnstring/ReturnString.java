
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package returnstring;

/**
 *
 * @author zhuyi
 */
public class ReturnString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String first = "                                            Yi ";
    final String last = "  Zhu  ";
    final String name = first.trim().concat(" ").concat(last.trim());
     //final String name = first.concat(" ").concat(last);
    
    
    //System.out.println(last);
    System.out.println(name);
    }
}
