package blackJack;

public class Card {
    private Suit suit;
    private CardValue value;

    public Card(Suit suit, CardValue value) { // konstruktor przyjmuje typy danych Suit i Value
        this.suit = suit;
        this.value = value;
    }

    public CardValue getValue(){ //metoda zwraca wartosc karty
        return this.value;
    }

    public Suit getCardSuit(){ // metoda zwraca kolor karty
        return this.suit;
    }

    public String toString(){ // metoda zwraca ciąg znaków
        return this.suit.toString() + " " + this.value.toString(); // na zmiennej cardValue, metodą toString wydobywamy ciag znaków, cardSuit tak samo
    }
}
