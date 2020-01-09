/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactermethod;

/**
 *
 * @author zhuyi
 */
public class CharacterMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         char[] password = { 'a', 'b', '5', '?', '0', ' ' };
         if(checkPassword(password)) System.out.println("Valid Password!");
         else System.err.println("Invalid Passord!");
    }
    
    public static boolean checkPassword(char[] a){
        int count_Lowcase=0;
        int count_Uppercase = 0;
        int count_Digit = 0;
    for (int i = 0; i < a.length; i++) {
      if (Character.isDigit(a[i]))
        count_Digit++;
      if (Character.isLowerCase(a[i]))
        count_Lowcase ++;
      if (Character.isUpperCase(a[i]))
        count_Uppercase++;
    }
    if(count_Uppercase > 0 && count_Lowcase > 0 && count_Digit > 0) return true;
    else return false;
    
    }
    
}
