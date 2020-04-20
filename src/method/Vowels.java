package method;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = in.nextLine();
        System.out.print("Number of vowels in word is= " + countVowels(word));
    }

    public static int countVowels(String string) {
        String myWord = string.toLowerCase();
        int count = 0;
        for (int i = 0; i < myWord.length(); i++) {
            if (myWord.charAt(i) == 'a' || myWord.charAt(i) == 'e' || myWord.charAt(i) == 'i'
                    || myWord.charAt(i) == 'o' || myWord.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}