package doc;

public class MyMath {

    public static void main(String[] args) {
        int result = power(2, 4);
        System.out.println(result);
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }
}