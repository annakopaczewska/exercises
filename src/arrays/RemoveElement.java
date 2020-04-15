package arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] array = {20, 55, 18, 190};
        System.out.println("Original array= " + Arrays.toString(array));

        System.out.println("Array after remove index= " + Arrays.toString(remove(array, 1)));
    }

    public static int[] remove(int[] newArray, int element) {
        int[] result = new int[newArray.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == element) {
                for (int j = 0; j < newArray.length - 1; j++) {
                    result[j] = newArray[j + 1];
                }
            }
        }
        return result;
    }
}
