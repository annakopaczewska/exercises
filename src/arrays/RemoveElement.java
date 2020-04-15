package arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] array = {20, 55, 18, 190};
        System.out.println("Original array= " + Arrays.toString(array));


        int[] array1 = remove(array, 1);
        System.out.println("Array after remove index= " + Arrays.toString(array1));
    }

    public static int[] remove(int[] newArray, int element) {
        int[] result = new int[newArray.length];
        for (int i = 0; i < newArray.length -1; i++) {
            if (i == element) {
                continue;
            }
                newArray[] = newArray[i + 1];
            }
        return result;
    }
}
