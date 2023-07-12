package cs171.sum2023.lab3;

public class Deck {

    static final int CARD_COUNT=52;

    Card[] cards = new Card[CARD_COUNT];

    public Deck(){

        for (int suit =0; suit <4; suit++){
            for(int rank=0; rank<13; rank++){
                this.cards[suit*13 + rank] = new Card(suit+1, rank+1);
            }
        }
    }


}
