package thinkjava.ex14;

public class Main {
    public static void main(String[] args) {

        Card card = new Card(2, 8);
        Card card1 = new Card(6,10);
        System.out.println(card.compareTo(card1));
    }
}
