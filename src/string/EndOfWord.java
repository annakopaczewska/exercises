package string;

public class EndOfWord {
    public static void main(String[] args) {
        String s1 = "table";
        String s2 = "le";
        checkEnd(s1, s2);
    }

    public static void checkEnd(String s1, String s2) {
        if (s1.endsWith(s2)) {
            System.out.println("String with end 'le' is exist.");
        } else {
            System.out.println("String with end 'le' is not exist.");
        }
    }
}
