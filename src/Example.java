import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
}
