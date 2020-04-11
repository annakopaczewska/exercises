package doc;

public class Ex25 {
    public static void main(String[] args) {

        int n = factorialNumber(4);
        System.out.println(n);

    }

    public static int factorialNumber (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
