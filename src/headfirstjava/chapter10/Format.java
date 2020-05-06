package headfirstjava.chapter10;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Format {
    public static void main(String[] args) {
        double a = 53.4567;

        NumberFormat format = NumberFormat.getCurrencyInstance();
        String myString = format.format(a);
        System.out.println(myString);


        Locale locale = Locale.UK;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String string = numberFormat.format(a);
        System.out.println(string);

        int number = 1111534233;
        NumberFormat formater = NumberFormat.getNumberInstance();
        String myNumber = format.format(number);
        System.out.println(myNumber);

        NumberFormat format1 = new DecimalFormat();
        String newString = format1.format(number);
        System.out.println(newString);
    }
}
