package cs171.sum2023.lab3;

import java.util.Random;

public class Dealer {
    private Deck deck;

    public Dealer( Player[] payers, Deck deck){
        this.deck =deck;
        this.shuffle();
       // this.distribute(players, this.deck);
    }
    public Dealer( Deck deck){
        this.deck =deck;
        this.shuffle();

    }
    private void shuffle(){
        Random random =new Random();
        for (int card =0; card< deck.cards.length; card++ ){
          swap(random.nextInt(deck.cards.length),random.nextInt(deck.cards.length));

        }

    }

    private void swap( int index1, int index2){
        //swap two cards
        Card temp;
        temp = this.deck.cards[index1];
        this.deck.cards[index1]=this.deck.cards[index2];
        this.deck.cards[index2]=temp;
    }
    public void printCards(){
        for (int card =0; card< deck.cards.length; card++ ){
            System.out.println("Card suit:" + this.deck.cards[card].getSuit()+ "Card rank:" + this.deck.cards[card].getRank());
        }
    }
}
