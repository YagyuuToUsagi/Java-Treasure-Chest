/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolwut;

/**
 *
 * @author brianaranda
 */
public class Lolwut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aArray = {1, 2, 3};
        changeValue(aArray);
        System.out.println("aArray[1]=" + aArray[1]);
    }

    public static void changeValue(int[] aArray) {
        aArray[1] = 5;
//        return aArray;
    }
}
