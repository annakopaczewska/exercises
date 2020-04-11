package doc;

public class Ex17 {
    public static void main(String[] args) {
        nonRepeatingString("abcabcXyyzz");
    }

    public static void nonRepeatingString(String word) {
        for (int i = 0; i < word.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < word.length(); j++) {
                if (i != j && word.charAt(i) == word.charAt(j)) {
                    unique = false;
                }
            }
            if (unique) {
                System.out.println("Non repeating is " + word.charAt(i));
            }
        }
    }
}