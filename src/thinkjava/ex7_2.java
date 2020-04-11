package thinkjava;

public class ex7_2 {
    public static void main(String[] args) {

        System.out.println(squareRoot(9));
    }

    public static double squareRoot(double a) {
        double guess = a / 2;
        double expected = (guess + (a / guess)) / 2;

        while (Math.abs((guess - expected)) > 0.0001) {
            guess = expected;
            expected = (guess + (a / guess)) / 2;
        }
        return expected;
    }
}
