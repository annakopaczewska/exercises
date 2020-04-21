package method;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        System.out.println("Input value: ");
        Scanner input = new Scanner(System.in);
        char a = input.nextLine().charAt(0);
        System.out.println("ASCII value is= " + ascii(a));
    }

    public static int ascii(char a) {
        return a;
    }
}
