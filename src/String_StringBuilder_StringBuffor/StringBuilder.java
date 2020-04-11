package String_StringBuilder_StringBuffor;

public class StringBuilder {
    public StringBuilder(String a) {

    }

    public StringBuilder() {

    }

    public static <StringBuiffer> void main(String[] args) {

        //utworzenie pustego bufora. StringBuilder jako argument może też przyjąć tekst
        // (wtedy zostanie automatycznie nim zainicjowany) lub liczbę (wtedy rozmiar bufora
        // zostanie ustawiony na podaną wartość).
        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        sb.append("Java"); // modyfikacja bufora przez metodę append. Metoda append modyfikuje obiekt, na którym jest wywoływana oraz zwraca dokładnie ten sam obiekt.

        sb.append(' '); // dodaje pojedynczy znak spacji. Metoda append jest przeciążona, dzięki czemu można dodawać przy jej pomocy: stringi,
        // pojedyncze znaki, zmienne boolean, liczby oraz dowolne inne obiekty – wtedy zostanie wywołana na nich metoda toString().

        sb.append("Rocks").append("!").append(0); // tworzenie łańcuha wywołań, dzięki temu, że metoda append zwraca obiekt this,
        // takie wywołanie jest jednoznaczne z rozbiciem tego na pojedyncze linie.

        String value = sb.toString(); // value => "Java Rocks!0" linia pobiera zbuforowany tekst i zapisuje go w zmiennej typu String.

        System.out.println(value); // wyświetlam
    }

    public void append(String b) {
    }
}

