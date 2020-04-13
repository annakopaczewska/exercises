package doc;

import java.util.Arrays;

public class Ex16 {
    public static void main(String[] args) {

        int[] array = reverse(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(array));

        }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reverse[reverse.length - i - 1] = array[i];
        }
        return reverse;
    }
}
