package doc;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double result = convertInchToMeters(100);
        System.out.println(result);
    }

    public static double convertInchToMeters (double Inch) {
        return Inch * 0.0254;
    }
}