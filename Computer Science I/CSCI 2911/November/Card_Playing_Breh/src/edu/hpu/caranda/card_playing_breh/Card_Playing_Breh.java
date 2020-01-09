package edu.hpu.caranda.card_playing_breh;

import java.util.Scanner;

public class Card_Playing_Breh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card Card1, Card2, CardHit;
        DeckOfCards theDeck = new DeckOfCards();
        int blackJack = 21;
        int playerTotal, bjValue1, bjValue2, bjValueHit, addition;
        String descision;
        boolean end_game = false, hit_me = true;

        theDeck.shuffleAll();

        System.out.println("You've aquired: \n");
        Card1 = theDeck.pickARandomCard();
        //Get's a random card out of a deck
        System.out.print(Card1);
        //Prints out the chosen card.
        bjValue1 = Card1.getBlackJackValue();
        //Gets the Blackjack valuse of the chosen card.
        System.out.println("(Blackjack value of: " + bjValue1 + ")\n");
        //Prints out the Blackjack valuse of the chosen card.

        Card2 = theDeck.pickARandomCard();
        //Get's a random card out of a deck
        System.out.print(Card2);
        //Prints out the chosen card.
        bjValue2 = Card2.getBlackJackValue();
        //Gets the Blackjack valuse of the chosen card.
        System.out.println("(Blackjack value of: " + bjValue2 + ")\n");
        //Prints out the Blackjack valuse of the chosen card.

        addition = bjValue1 + bjValue2;
        //Adds the Blackjack value of both "cards."
        System.out.println("Your Blackjack value is " + addition);

        if (addition > blackJack) { //Checks if Blackjack total is over 21
            System.out.print("Sorry, you got a bust.");
            end_game = true;
        } else if (addition == blackJack) { //Checks if Blackjack total equals to 21
            System.out.print("Blackjack! You got em' fam!");
            end_game = true;
        } else { //If Blackjack value is neither of the statements, then the game keeps going.
            end_game = false;
        }

        if (end_game==false) {

            System.out.println("Would you like to hit or stand?"); //Asks user if he/she wants to hit or stand
            descision = input.nextLine();

            if (descision.matches("hit|Hit|H|h")) {

                while (end_game == false && hit_me) {

                    System.out.println("You've aquired: \n");
                    CardHit = theDeck.pickARandomCard();
                    //Get's a random card out of a deck
                    System.out.print(CardHit);
                    //Prints out the chosen card.
                    bjValueHit = CardHit.getBlackJackValue();
                    //Gets the Blackjack valuse of the chosen card.
                    System.out.println("(Blackjack value of: " + bjValueHit + ")\n");
                    //Prints out the Blackjack valuse of the chosen card.
                    addition = addition + bjValueHit;
                    System.out.println("Your new Blackjack value is " + addition+"\n");
                    
                    if (addition > blackJack) { //Checks if Blackjack total is over 21
                        System.out.print("Sorry, you got a bust.");
                        end_game = true;
                    }
                    else if(addition==blackJack){
                        System.out.print("Blackjack! You got em' fam!");
                        end_game = true;
                    }
                    else{
                        System.out.println("Would you like to hit or stand?");
                        descision = input.nextLine();                        
                    }
                }

            } else if (descision.matches("stand|Stand|S|s")) {

                if (addition > blackJack) { //Checks if Blackjack total is over 21
                    System.out.print("Sorry, you got a bust.");
                    end_game = true;
                } else if (addition == blackJack) { //Checks if Blackjack total equals to 21
                    System.out.print("Blackjack! You got em' fam!");
                    end_game = true;
                } else { //If Blackjack value is neither of the statements, then the game keeps going.
                    System.out.print("END");
                    end_game = false;
                }
            } else {
                System.out.println("Invalid input. Please enter whether you would like to hit or stand");
                //If the user input is invalid, then it asks the 
                descision = input.nextLine();
                //NOTE: I forgot how to loop this thing!!! :O 
            }

        }

//        System.out.println("You picked the: "+myCard);
//        
//        System.out.println("I picked the: "+yourCard);
//                
//        if(myCard.value>yourCard.value){
//            System.out.println("Whohoo, I win!");
//        }
//        else if (myCard.value<yourCard.value){
//            System.out.println("Damn, I lose!");           
//        }
//        else{
//            System.out.println("Dafaq, it's a tie!");
//        }
    }

}
