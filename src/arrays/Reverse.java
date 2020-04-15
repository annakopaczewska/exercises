package arrays;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {20, 5, 90, 1};
        System.out.println(Arrays.toString(reverse(array)));
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reverse[reverse.length - i - 1] = array[i];
        }
        return reverse;
    }
}