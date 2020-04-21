package method;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = in.nextLine();
        System.out.println("Middle char is: " + middleChar(string));

    }

    public static char middleChar(String string) {
        return string.charAt(string.length() / 2);
    }
}
