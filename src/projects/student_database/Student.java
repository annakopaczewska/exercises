package projects.student_database;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private final String name;
    private final String lastName;
    private final int gradeYear;
    private String studentID;
    private String courses = "";
    private int balance = 0;
    private final int costOfCourse = 500;
    private static int ID = 99;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("1 - Freshman\n2 - Middle\n3 - Senior\n Enter student level: ");
        this.gradeYear = scanner.nextInt();
        setStudentID();
        System.out.println(name + " " + lastName + " " + gradeYear + " " + studentID);
    }

    private void setStudentID() {
        ID++;
        this.studentID = gradeYear + "" + ID;
    }

    public void signUp() {
        do {
            System.out.println("Enter course to sign up (E to exit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("E")) {
                courses = courses + "\n " + course;
                balance = +costOfCourse;
            } else {
                break;
            }
        }
        while (1 != 0);
    }

    public void viewBalance() {
        System.out.println("Your balance is: " + balance + " PLN");
    }

    public void payAdvance() {
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        balance -= payment;
        System.out.println("Thanks for your payment PLN" + payment);
        viewBalance();
    }

    public String toString() {
        return "Name: " + name + " " + lastName
                + "\nGrade lvl: " + gradeYear
                + "\nStudent ID: " + studentID
                + "\nCourses Enrolled: " + courses
                + "\nBalance: PLN" + balance;
    }
}