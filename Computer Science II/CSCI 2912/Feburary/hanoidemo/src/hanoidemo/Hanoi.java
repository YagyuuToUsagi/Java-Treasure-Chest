/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoidemo;

/**
 *
 * @author brianaranda
 */
public class Hanoi {
    private int numDisc;
    private int stepCount;
    
    public Hanoi(int n){
        numDisc=n;
        stepCount=0;
        moveDiscs(numDisc, 'A', 'B', 'C');
    }
    
    private void moveDiscs(int num, char fromPeg, 
            char toPeg, char tempPeg){
        if (num>0){
            moveDiscs(num-1, fromPeg, tempPeg, toPeg);
            System.out.println("Step "+(++stepCount)+" : Move a disc from Peg "
                    +fromPeg+" to Peg "+toPeg);
            moveDiscs(num-1, tempPeg, toPeg, fromPeg);
        }
    }
}
