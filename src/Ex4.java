public class Ex4 {
    public static void main(String[] args) {

        String[] names = new String[]{"Kacper", "anna", "kajak"};
        boolean[] expectedToBePalindrome = new boolean[]{false, true, true};

        for (int i = 0; i < names.length; i++) {
            boolean isPalindrome = PalindromeChecker.isPalindrome(names[i]);

            if (isPalindrome != expectedToBePalindrome[i]) {
                System.out.println("Mamy błąd dla: " + names[i]);
            }
        }
    }
}

class PalindromeChecker {
    static boolean isPalindrome(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            char beginLetter = text.charAt(i);
            char endLetter = text.charAt(length - 1 - i);
            if (beginLetter != endLetter) {
                return false;
            }
        }
        return true;
    }
}
