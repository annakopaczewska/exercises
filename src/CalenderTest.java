import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalenderTest {
    public static void main(String[] args) {

        // tworzymy obiekt kalendarza, który inicjujemy aktualną datą
        LocalDate date = LocalDate.now();
        //pobieramy aktualny dzien i miesiąc
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        //ustawiamy zmienną date na początek miesiąca
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        // 1= poniedzialek ... 7= niedziela
        int value = weekday.getValue();

        // nagłówek i wcięcie dla pierwszego wiersza
        System.out.println("Pn Wt Śr Czw Pt Sb Nd");
        for (int i = 0; i < value; i++) {
            System.out.println(" ");
        }
        // przeglądanie dni miesiąca
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getMonthValue());

            if (date.getDayOfMonth() == today) {
                System.out.println("*");
            } else {
                System.out.println(" ");
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) {
                    System.out.println();
                }
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
