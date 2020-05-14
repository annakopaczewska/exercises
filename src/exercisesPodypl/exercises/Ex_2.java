package exercisesPodypl.exercises;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {

        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        String input;

        while(!(input = scanner.next()).equals("exit")){
            System.out.println("Given number is: " + input);
            System.out.println("Give me a number: ");
        }
    }
}

