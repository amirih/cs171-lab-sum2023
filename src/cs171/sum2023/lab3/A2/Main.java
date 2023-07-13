package cs171.sum2023.lab3.A2;


public class Main {


    public static void main(String[] args) {
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        dealer.printCards();
    }
}
