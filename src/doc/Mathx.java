package doc;

public class Mathx {

    public static void main(String[] args) {

        int base = 2;
        int exponent = 4;
        int result = 1;

        // 2^0 = 1
        // 2^1=2
        // 2^2 = 2*2
        // 2^3 = 2*2*2
        // 2^4 = 2*2*2*2
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        System.out.println(result);
        power(base, exponent);
        power(2, 4);
    }

    public static int power(int base, int exponent) {

        System.out.println(base);
        System.out.println(exponent);
        return 3;
    }
}
