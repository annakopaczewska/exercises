package akademiakodu;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a first number: ");
        double number = scanner.nextDouble();
        System.out.println("Give me a second number: ");
        double number2 = scanner.nextDouble();

//        int sum = number + number2;
//        System.out.println("Sum is equals = " + sum);

//        int lastDigit = number % 10;
//        System.out.println("Last digit is: " + lastDigit);

        double multi = number + number2;
        System.out.println("Multiplication is equals = " + multi);
        
    }
}
