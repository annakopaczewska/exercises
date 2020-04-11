package doc;

public class Ex28a {

    public static void main(String[] args) {

       powerOfNumber(2,4);
    }

    public static void powerOfNumber (int a, int b) {
        int number = 2;
        int exponent = 4;
        int result = 1;

        for (int i = 0; i != exponent; exponent--) {
            result = result * number;
        }
        System.out.println(result);
    }
}
