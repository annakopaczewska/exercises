package thinkjava;

public class ex9_6 {
    public static void main(String[] args) {

        boolean word = isDoubloon("Anna");
        System.out.println(word);
    }

    public static boolean isDoubloon(String string) {
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            int count = 0;
            for (int j = 0; j < lowerCase.length(); j++) {
                if (lowerCase.charAt(i) == lowerCase.charAt(j)) {
                    count++;
                    if (2 < count) {
                        return false; // więcej niż dwie
                    }
                }
            }
            if (1 == count) {
                return false; // ta forma jest tylko raz
            }
        }
        return true;
    }
}