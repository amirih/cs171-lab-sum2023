package cs171.sum2023.lab3.A2;

public class Card {
    private int rank;
    private int suit;

    public Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

}
