package blackJack;

import java.util.ArrayList;

public class PlayerDeck {

    private ArrayList<Card> cards;

    public PlayerDeck() {
        cards = new ArrayList<>();
    }

    public Card getCard(int i) {
        return this.cards.get(i);
    }

    public Card getLastCard() {
        int size = this.cards.size() - 1;
        return this.cards.get(size);
    }

    public void draw(Deck comingFrom) {
        this.cards.add(comingFrom.getCard());
    }

    // zwracam vartosci kart w tali
    public int cardsValue() {
        int totalValue = 0;
        int ass = 0;

        for (Card card : this.cards) {
            CardValue cardValue = card.getValue();
            if (cardValue != CardValue.ASS) {
                int numericValue = cardValue.getNumericValue();
                totalValue += numericValue;
            } else {
                ass++;
            }
        }


        for (int i = 0; i < ass; i++) {
            if (totalValue > 10) { // ma przynajmniej 11 punktow to dodanie 11 i przegra wiec dodajemy 1
                totalValue += 1;
            } else { // ma mniej lub rowno 10 wiec dodajemy 11
                totalValue += 11;
            }
        }
        return totalValue;

    }

    public String toString() { // metoda zwraca wszystkie karty w String
        StringBuilder cardListOutPut = new StringBuilder("");
        for (Card card : this.cards) {
            cardListOutPut.append(card.toString()).append("\n");
        }
        return cardListOutPut.toString();
    }

}
