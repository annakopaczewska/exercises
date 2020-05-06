package headfirstjava.chapter10;

import java.text.NumberFormat;

public class Format {
    public static void main(String[] args) {
        double a = 53.4567;

        NumberFormat format = NumberFormat.getCurrencyInstance();
        String myString = format.format(a);
        System.out.println(myString);
    }
}
