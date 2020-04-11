package doc;

import java.util.Scanner;

public class Ex6_1 {
    public static void main(String[] args) {

        double inch = 1000;
        double result = convertInchToMeters(inch);

        System.out.println(result);
    }

    public static double convertInchToMeters (double Inch) {
        return (Inch * 0.0254);
    }
}
