package arrays;

import java.util.Arrays;

public class ArrangeElements {
    public static void main(String[] args) {
        int[] myArray = {-5, -10, 18, 9, -25, 96};
        System.out.println(Arrays.toString(arrangeElements(myArray)));
    }

    public static int[] arrangeElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return array;
    }
}
