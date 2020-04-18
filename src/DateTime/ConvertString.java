package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertString {
    public static void main(String[] args) {
        String string = "April 18, 2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(string, formatter);
        System.out.println(localDate);

        String string2 = "18 04 2020 17:30";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");

        LocalDateTime localDate2 = LocalDateTime.parse(string2, formatter2);
        LocalDateTime plusDays = localDate2.plusDays(3);
        System.out.println(plusDays);
        System.out.println(localDate2.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss");
        System.out.println(localDate2.format(formatter3));
    }
}
