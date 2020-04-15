package arrays;

import java.util.Arrays;

public class DuplicateValues {
    public static void main(String[] args) {

        duplicate(new int[]{2, 6, 18, 6, 70, 2});
    }

    public static void duplicate(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
