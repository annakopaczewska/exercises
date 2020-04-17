package DateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class NewYorkTime {
    public static void main(String[] args) {
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("New York"));
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY)
        + ": " + calNewYork.get(Calendar.MINUTE) + ": " + calNewYork.get(Calendar.SECOND));
    }
}
