package method;

import java.util.Scanner;

public class NarcissisticNumb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isNarcissistic(number));
    }

    public static boolean isNarcissistic(int number) {
        int a, b = 0, c = number;
        while (number > 0) {
            a = number % 10;
            number = number / 10;
            b = b + (a * a * a);
        }
        return c == b;
    }
}