package akademiakodu;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");

        int number = scanner.nextInt();
        if (number %  3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
