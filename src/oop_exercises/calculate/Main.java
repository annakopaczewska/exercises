package oop_exercises.calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter first numb: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second numb: ");
        num2 = scanner.nextInt();
        System.out.println("Enter third numb: ");
        num3 = scanner.nextInt();
        System.out.println("Result is: " + num1 * num2 * num3);
    }
}
