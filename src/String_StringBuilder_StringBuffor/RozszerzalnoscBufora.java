package String_StringBuilder_StringBuffor;

public class RozszerzalnoscBufora {

//    public static void main(String[] args) {
//// 1 Tworzymy nowy obiekt, ustawiajac rozmiar bufora na 3, bufor jest jeszcze pusty, dlatego metoda length zwraca 0,
//
//        StringBuilder sb = new StringBuilder(3);
//        assertEquals(3, sb.capacity());
//        assertEquals(0, sb.length());
//
//// 2 Dodajemy pierwszy element bufora, ponieważ ilosc elementów bez problemu miesci sie jeszcze w buforze,
//// nie bylo potrzeby jego rozszerzenia
//
//        sb.append("1");
//        assertEquals(3, sb.capacity());
//        assertEquals(1, sb.length());
//
//// 3 dodajemy 2 nowe elementy, tutaj bufor jest pełny, czyli capacity i length sa sobie rowne,
//        sb.append("23");
//        assertEquals(3, sb.capacity());
//        assertEquals(3, sb.length());
//
//// 4       dodanie kolejnego elementu bufora wymusilo jego powiekszenie, ilosc elementow w buforze to 4,
////          a jego rozmiar został tak zwiekszony by mogl przyjac wiecej elementów
////         Rozszerzenie bufora polega na utworzeniu nowego bufora o rozmiarze:
////         2x[rozmiar aktualnego bufora]+2 oraz przekopiowaniu do niego zawartości starego bufora.
//
//        sb.append("4");
//        assertTrue(sb.capacity() > 4);
//        assertEquals(4, sb.length());
//    }
}
