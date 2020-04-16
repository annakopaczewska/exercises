package DateTime;

import java.util.Calendar;

public class DateCalendar {
    public static void main(String[] args) {
        int year = 2020;
        int month = 3;
        int day = 16;

        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.YEAR);
        calendar.get(Calendar.MONTH);
        calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
    }
}
