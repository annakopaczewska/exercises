package blackJack;

import java.util.ArrayList;
import java.util.Random;

/**
 * Po utworzeniu jest to stos 52 kart losowo potasowanych.
 * Pobranie jednej karty odbywa sie za pomoca getCard()
 */

public class Deck {

    private ArrayList<Card> cards = new ArrayList<>(); // typ danych Card, lista przechowuje wszystkie karty tej gry

    public Deck() { // konstruktor
        createFullDeck();
        shuffle();
    }

    public Card getCard() {
        int lastCardIndex = cards.size() - 1;
        Card card = cards.get(lastCardIndex);
        cards.remove(lastCardIndex);
        return card;
    }

    private void createFullDeck() {
        for (int suit = 0; suit < 4; suit++) { // uruchomi sie 4 razy, reprezentuje kolor karty
            for (int value = 0; value < 13; value++) { // reprezentuje wartoc karty, uruchamia sie 13 razy, tyle ile wartosci
                Suit currentSuit = Suit.values()[suit];
                CardValue cardValue = CardValue.values()[value];
                Card card = new Card(currentSuit, cardValue);
                this.cards.add(card);
            } // do listy cards dodajemy nowy obiekt, wysylamy do konstruktora jakies wartosci,
        }
    }

    private void shuffle() { // TASOWANIE kart
        ArrayList<Card> temporaryDeck = new ArrayList<>();
        Random random = new Random();
        int randomCardIndex = 0;
        int originalSize = this.cards.size();

        for (int i = 0; i < originalSize; i++) {
            // Generuje przypadkowa liczbe
            randomCardIndex = random.nextInt(this.cards.size()); // losowanko liczby <0; 52)
            temporaryDeck.add(this.cards.get(randomCardIndex));
            // losowanie z oryginalnej tali
            this.cards.remove(randomCardIndex);
        }
        this.cards = temporaryDeck;
    }

}