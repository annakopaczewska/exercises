package thinkjava;

public class ex8_7 {
    public static void main(String[] args) {

        boolean array = arePrimeFactors(10, new int[]{2});
        System.out.println(array);

    }

    public static boolean arePrimeFactors(int n, int[] array) {
        int result = 1;

        for (int element : array) {
            if (isPrime(element)) {
                result = result * element;
            } else {
                return false;
            }
        }
        return result == n;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= n * n; i = i + 2) {
                if (n % i != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}