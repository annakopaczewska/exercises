package arrays;

import java.util.Arrays;

public class SeparateOddEven {
    public static void main(String[] args) {
        int[] myArray = {20, 13, 45, 66, 79, 2};
        separateOddEven(myArray);
    }

    static void separateOddEven(int[] array) {
        int i = 0;
        int j = 0;

        while (j < array.length) {
            if (array[j] % 2 == 0) {
                int temp;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(array));
    }
}
