/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleofrecursion;

/**
 *
 * @author brianaranda
 */
public class ExampleOfRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Main method
        ToPrint(5);
    }

    public static void ToPrint(int a) {
        System.out.println("This is the method for " + a);

        if (a == 1) {
            System.out.println("This is the base case");
            System.out.println(a);
            System.out.println("The method for " + a + " is finished.");
        } else {
            ToPrint(a - 3);
            System.out.println(a);
            System.out.println("The method for " + a + " is finished.");

        }

    }
}
