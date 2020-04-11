package thinkjava;

public class ex7_3 {
    public static void main(String[] args) {

        System.out.println(power(2, 2));

    }

    public static double power(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result = (x * result);
        }
        return result;
    }
}
