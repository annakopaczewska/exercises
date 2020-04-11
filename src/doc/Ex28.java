package doc;

public class Ex28 {

    public static void main(String[] args) {
        powerOfNumber(2, 4);
    }

    public static void powerOfNumber(int a, int b) {

        int number = 2;
        int exponent = 4;
        int result = 1;
        while (exponent != 0) {
            result = result * number;
            --exponent;
        }
        System.out.println(result);
    }
}