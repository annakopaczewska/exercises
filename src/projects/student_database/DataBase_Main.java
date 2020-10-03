package projects.student_database;

import java.util.Scanner;

public class DataBase_Main {
    public static void main(String[] args) {

        System.out.println("Enter number of new student to sigh in: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].signUp();
            students[i].payAdvance();
            System.out.println(students[i].toString());
        }
    }
}
