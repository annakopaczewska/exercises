package thinkjava.ex13;

public class Card {

    private final int rank;
    private final int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int compareTo(Card that) {
        if (suit < that.suit) {
            return -1;
        }
        if (suit > that.suit) {
            return 1;
        }
        return Integer.compare(rank, that.rank);
    }

    public boolean equals(Card that) {
        return rank == that.rank
                && suit == that.suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public int score() {
        return rank;
    }

    public static final String[] RANKS = {
            null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"};

    public String toString() {
        return RANKS[rank] + " of " + SUITS[suit];
    }

}
