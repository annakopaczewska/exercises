package exBasicI;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(findLongestPalindrome(input));
    }

    public static String findLongestPalindrome(String word) {
        String longestPalindrome = "";
        String checkPalindrome = "";
        for (int i = 0; i < word.length() - 1; i++) {
            for (int j = i + 2; j <= word.length(); j++) {
                if (isPalindrome(word.substring(i, j))) {
                    checkPalindrome = word.substring(i, j);
                }
            }
            if (checkPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = checkPalindrome;
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String string) {
        int end = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(end)) {
                return false;
            }
            end--;
        }
        return true;
    }
}
