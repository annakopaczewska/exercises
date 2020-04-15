package arrays;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {

        int[] myArray = new int[]{15, 35, 56, 80};
        System.out.println("Actually array= " + Arrays.toString(myArray));

        System.out.println("New array= " + Arrays.toString(insertElement(myArray, 1, 20)));
    }

    public static int[] insertElement(int[] newArray, int index, int value) {
        int[] result = new int[newArray.length];
        if (index >= 0) System.arraycopy(newArray, 0, result, 0, index);
        result[index] = value;
        for (int i = index + 1; i < newArray.length; i++) {
            result[i] = newArray[i-1];
        }
        return result;
    }
}
