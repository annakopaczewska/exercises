package headfirstjava.chapter10;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CurrentDate {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat formater = DateFormat.getDateInstance();
        String myDate = formater.format(date);
        System.out.println(myDate);

        Locale localeUK = Locale.UK;
        DateFormat formatUK = DateFormat.getDateInstance(DateFormat.DEFAULT, localeUK);
        String stringUK = formatUK.format(date);
        System.out.println(stringUK);
    }
}
