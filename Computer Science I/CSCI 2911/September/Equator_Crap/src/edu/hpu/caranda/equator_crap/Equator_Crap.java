package edu.hpu.caranda.equator_crap;

import java.util.Random;

public class Equator_Crap {

    public static void main(String[] args) {
        Random flip = new Random();
        int equator = 0, step=0;

        while (!(equator==100 || equator==-100) ) {
            int coin = flip.nextInt(2);
            
            step++;
            
            if(coin==0){
                equator+=1;
            }
            else{
                equator-=1;
                
            }
            
        }
        System.out.print("It took you "+step+" steps to get to the equator.");
    }

}
