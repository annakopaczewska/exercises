package doc;

public class Ex10 {
    public static void main(String[] args) {

        System.out.println(countLetter("developer", 'e'));
    }

    public static int countLetter(String someString, char someChar) {
        int count = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
        }
        return count;
    }
}