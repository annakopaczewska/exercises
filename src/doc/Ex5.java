package doc;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double result = convertCelsiusToFahrenheit(100);
        System.out.println(result);
    }

    public static double convertCelsiusToFahrenheit (double Celsius) {

        return (1.8 * Celsius) + 32;
    }
}
