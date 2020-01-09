package edu.hpu.caranda.card_playing_breh;

import java.util.Random;

public class DeckOfCards {

    Card[] theDeck = new Card[52];
    Random bag=new Random();
    int numberCards=52;
    Card card1, card2;
    
    public DeckOfCards() {
        String[] rank = {"a", "2", "3", "4", "5", "6", "7", "8", "9", "t", "j", "q", "k"};
        String[] suit = {"d", "c", "h", "s"};

        int k = 0;

        for (int i = 0; i < 13; ++i) { //Loops through the Rank

            for (int j = 0; j < 4; ++j) { //Loops through the suit
                theDeck[k]=new Card(""+rank[i]+suit[j]); //Makes a card
                k++; //Increments k
            }

        }
    }
    
    public Card pickARandomCard(){
        
        return theDeck[bag.nextInt(52)];
    }
    public Card dealCard(){
        
       numberCards--; //Decreases number of cards
        return theDeck[numberCards]; //Returning card that's stored in the deck that is in the number of cards
    }
    
    public void shuffleAll(){
        numberCards=52;
        for(int i=theDeck.length-1; i>=0; --i){
            int j=bag.nextInt(i+1);
            swap(i, j);
            
    }

    }
    public void swap(int i, int j){
        Card tmp;
        
        tmp=theDeck[i];
        theDeck[i]=theDeck[j];
        theDeck[j]=tmp;
    }
}
