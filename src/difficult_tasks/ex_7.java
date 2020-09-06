package difficult_tasks;

public class ex_7 {
    public static void main(String[] args) {

        calculatesExponent(2, 4);
    }

    public static void calculatesExponent(int number, int exponent) {
        int result = 1;
        while (exponent != 0) {
            result = result * number;
            --exponent;
        }
        System.out.println(result);
    }
}
