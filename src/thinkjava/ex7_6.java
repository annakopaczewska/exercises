package thinkjava;

public class ex7_6 {
    public static void main(String[] args) {

        System.out.println(guess(2, 2));
    }

    public static double guess(double x, int n) {
        double result = 1;
        int q = 1;
        double p = 1;
        int z = 1;

        for (int i = 0; i < n; i++) {
            result = result + (z = z * -1) * (p = p * x * x) / (q = q * 1);
        }
        return result;
    }
}
