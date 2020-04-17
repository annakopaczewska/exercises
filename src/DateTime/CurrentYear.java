package DateTime;

import java.time.Year;

public class CurrentYear {
    public static void main(String[] args) {

        Year currentYear = Year.now();
        System.out.println(currentYear);
        boolean isLeap = currentYear.isLeap();
        System.out.println(isLeap);
        int length = currentYear.length();
        System.out.println(length);
    }
}
