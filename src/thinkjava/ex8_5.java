package thinkjava;

import java.util.Arrays;

public class ex8_5 {
    public static void main(String[] args) {

    boolean[] a= sieve(7);
        System.out.println(Arrays.toString(a));

    }

    public static boolean[] sieve(int n) {
        boolean[] result = new boolean[n];
        for (int i = 2; i < n; i++) {
            result[i] = true;
        }
        for (int number = 2; number * number <= n; number++) {
            if (result[number]) {
                for (int i = number * 2; i < n; i = i + number) {
                    result[i] = false;
                }
            }
        }
        return result;
    }
}
