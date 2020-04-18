package arrays;

import java.util.Arrays;

public class SeparateZero {
    public static void main(String[] args) {
        int[] myArray = {0, 0, 1, 1, 0, 1, 1, 1, 0};
        int[] result;
        System.out.println("Original array: ");
        System.out.println(Arrays.toString(myArray));

        int number = myArray.length;

        result = separateZero(myArray, number);
        System.out.println("New array: ");
        System.out.println(Arrays.toString(result));
    }

    static int[] separateZero(int[] array, int number) {
        int count = 0;

        for (int i = 0; i < number; i++) {
            if (array[i] == 0)
                count++;
        }
        for (int i = 0; i < count; i++)
            array[i] = 0;

        for (int i = count; i < number; i++)
            array[i] = 1;
        return array;
    }
}
