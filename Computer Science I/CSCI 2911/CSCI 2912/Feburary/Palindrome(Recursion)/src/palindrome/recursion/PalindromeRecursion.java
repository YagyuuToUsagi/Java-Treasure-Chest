/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.recursion;

/**
 *
 * @author brianaranda
 */
public class PalindromeRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str="sus";
        System.out.println("Q: Is '"+str+"' a palindrome?");
        System.out.println("A: "+palindromecheck(str));
    }
    
    public static boolean palindromecheck(String str){
        int len=str.length();
        if(len<=1) return true;//Base case 1
        else if (str.charAt(0)!=str.charAt(len-1)) return false; //Base case 2
        
        return palindromecheck(str.substring(1, len-1)); //Recursive case
    }
}
