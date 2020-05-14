package exercisesPodypl.chapter_1;

public class Ex1_6_BubbleSort {
    public static void main(String[] args) {

        int[] numbers = new int[]{4, 2, 0, 2, 10, 1, 9, 12, 3, 5};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp;
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
