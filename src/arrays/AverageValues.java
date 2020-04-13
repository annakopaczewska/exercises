package arrays;

import java.util.Arrays;

public class AverageValues {
    public static void main(String[] args) {

        average(new int[]{1, 6, 7, 8});
    }

    public static void average(int[] numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }
        double result = sum / numbers.length;
        System.out.println("average is= " + result);
    }

}