package doc;

public class Ex29 {

    public static void main(String[] args) {
        squareRoot(2);

        }

    public static void squareRoot(int n) {
        double i;
        double digit = 0.001;

        for (i = 1; i * i <= n; i++) {
            for (i--; i * i < n; i += digit) {
            }
            System.out.println(i);
        }
    }
}