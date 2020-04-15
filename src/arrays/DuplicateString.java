package arrays;

public class DuplicateString {
    public static void main(String[] args) {


        duplicate(new String[]{"Anna", "tea", "cream", "pen","tea"});
    }

    public static void duplicate(String[] word) {
        for (int i = 0; i < word.length - 1; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j]) && (i != j)) {
                    System.out.println(word[i]);
                }
            }
        }
    }
}

