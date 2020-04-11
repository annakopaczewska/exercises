package exercisesPodypl;


import java.util.Arrays;

public class ChangePlace {

    public static void main(String[] args) {

        int[] array = new int[]{10, 5, 7, 25, 95};

        for (int i = 0; i < array.length; i++) {
           int temp  = array[i];
           array[i] = array[i+1];
           temp = array[i+1];
        }
        System.out.println(Arrays.toString(array));
    }
}
