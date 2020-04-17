package DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DifferentDate {
    public static void main(String[] args) {
//        ZonedDateTime now = ZonedDateTime.now();
//        ZonedDateTime oldDate = now.minusDays(1).minusMinutes(1);
//        Duration duration = Duration.between(oldDate, now);
//        System.out.println("ISO-8601: " + duration);
//        System.out.println("Minutes: " + duration.toMinutes());


        LocalDate d1 = LocalDate.of(2020, 3, 1);
        LocalDate d2 = LocalDate.of(2020, 3, 18);

        long days = ChronoUnit.DAYS.between(d1, d2);
        System.out.println( days );
    }
}
