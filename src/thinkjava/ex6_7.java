package thinkjava;

public class ex6_7 {
    public static void main(String[] args) {
        System.out.println(oddSum(10));
    }

    public static int oddSum(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 2 != 0) {
            return (n + oddSum(n - 1));
        } else {
            return oddSum(n - 1);
        }
    }
}