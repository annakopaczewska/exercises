package thinkjava;

public class ex9_5 {
    public static void main(String[] args) {

        boolean word = isAbecedarian("Ann");
        System.out.println(word);
    }

    public static boolean isAbecedarian(String word) {
        String lowerCase = word.toLowerCase();
        for (int i = 0; i < lowerCase.length() - 1; i++) {
            if (word.charAt(i) <= word.charAt(i + 1)) {
            } else {
                return false;
            }
        }
        return true;
    }
}
