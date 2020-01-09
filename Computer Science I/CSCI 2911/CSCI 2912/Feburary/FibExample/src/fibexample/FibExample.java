/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibexample;

/**
 *
 * @author brianaranda
 */
public class FibExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The Fib(2) is "+fib(4));
        
        
    }
    
    public static long fib(int n){
        if (n<=1) return 1;
        else return fib(n-1)+fib(n-2);
    }
    
}
