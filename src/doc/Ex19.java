package doc;

import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 4, 9, 8, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        bubbleSort(array);

        System.out.println("after bubble sort");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int number = 0;
        number = 1;
        increment(number);
        System.out.println(number);
    }

    public static void increment(int b) {
        b = 8;
        System.out.println(b);
    }

    public static void bubbleSort(int[] array) { // tablice są przekazywane przez referencje
        // w zwązku z czym są modyfikowane oryginalne zmienne/obiekty
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        }
    }
}