package method;

import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = in.nextLine();
        System.out.println("Count number is= " + countAllWords(string));

    }

    public static int countAllWords(String string) {
        int count = 0;
        int index = 0;
        do {
            index = string.indexOf(" ", index + 1);
            count++;
        }
        while (index != -1);
        return count;
    }
}
