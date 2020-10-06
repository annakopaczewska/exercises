package exBasicI;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {

        // średnia >=80 -> marks A
        // średnia <80 i >=60 -> marks B
        // średnia <60 i >= 40 -> marks C
        // inne marks D

        int average = 1;
        int[] marks = new int[3];
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Marks for Subject " + (i + 1) + "");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        scanner.close();

        average = total / 3;
        System.out.println("The student Mark is: ");
        if (average >= 80) {
            System.out.println("A");
        } else if (average < 80 && average >= 60) {
            System.out.println("B");
        } else if (average > 40 && average < 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
