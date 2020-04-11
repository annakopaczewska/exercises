package blackJack;

public enum CardValue {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ASS(11);

    private final int numericValue;

    private CardValue(int numericValue) { // konstruktor
        this.numericValue = numericValue;
    }

    public int getNumericValue() { //metoda która wydobywa wartość mojego enuma
        return numericValue;
    }
}
