package edu.hpu.caranda.card_playing_breh;

public class Card {

    char rank; //'a', '2','3',etc...'9','10','J','Q','K'.
    char suit; //'h', 'c','d','s' (Hearts, Clubs, Diamonds, Spades).
    int value; //Card value 2-14 (Ace is highest)

    public Card(String rs) { //Ex.:new Card ("2s") (Two of Spades) (Rank and suit)
        this.rank = rs.toLowerCase().charAt(0);
        this.suit = rs.toLowerCase().charAt(1);
        if (rank == 'a') {  //Sets 'a' to 14
            this.value = 14;
        } else if (rank == 't') { //Sets 't' to 10
            this.value = 10;
        } else if (rank == 'j') { //Sets 'j' to 111
            this.value = 11;
        } else if (rank == 'q') { //Sets 'q' to 12
            this.value = 12;
        } else if (rank == 'k') { //Sets 'k' to 13
            this.value = 13;
        } else {
            this.value = rank - '0'; //Sets any card from 2-9 to its original value.
        }
    }

    public String toString() { //Converts rank and suit of card to a string (Ex. Ace of Diamonds)

        String x = ""; //For rank
        String y = ""; //For suit

        if (rank == 'a') {  //Changes rank 'a' to Ace
            x = "Ace";
        } else if (rank == 't') { //Changes rank 't' to Ten
            x = "Ten";
        } else if (rank == 'j') { //Changes rank 'j' to Jack
            x = "Jack";
        } else if (rank == 'q') { //Changes rank 'q' to Queen
            x = "Queen";
        } else if (rank == 'k') { //Changes rank 'k' to King
            x = "King";
        } else if (rank == '2') { //Changes rank '2' to Two
            x = "Two";
        } else if (rank == '3') { //Changes rank '3' to Three
            x = "Three";
        } else if (rank == '4') { //Changes rank '4' to Four
            x = "Four";
        } else if (rank == '5') { //Changes rank '5' to Five
            x = "Five";
        } else if (rank == '6') { //Changes rank '6' to Six
            x = "Six";
        } else if (rank == '7') { //Changes rank '7' to Seven
            x = "Seven";
        } else if (rank == '8') { //Changes rank '8' to Eight
            x = "Eight";
        } else if (rank == '9') { //Changes rank '9' to Nine
            x = "Nine";
        }

        if (suit == 'h') {  //Sets suit h to Hearts
            y = "Hearts";
        }
        if (suit == 's') {  //Sets suit s to Spades
            y = "Spades";
        }
        if (suit == 'd') {  //Sets suit d to Diamonds
            y = "Diamonds";
        }
        if (suit == 'c') {  //Sets suit c to Clubs
            y = "Clubs";
        }

        return (x + " of " + y + ".");
    }

    public int getBlackJackValue() {

        if (rank == 'a') {
            value = 11;
            }else if(rank=='j'||rank=='q'||rank=='k'){
            value=10;
            }
            else{
            value=this.value;
            }

            return value;

        
    }
}
        
    
