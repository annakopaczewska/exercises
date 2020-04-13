package thinkjava.ex13;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.selectionSort();
        deck.shuffle();
        deck.print();

    }
}
