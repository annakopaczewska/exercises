package thinkjava;

public class ex7_5 {
    public static void main(String[] args) {
        System.out.println(myexp(2, 3));

    }

    public static double power(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result = (x * result);
        }
        return result;
    }

    public static double factorial(double x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static double myexp(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return (power(x, n) / factorial(x) + myexp(x, n - 1));
        }
    }
}
