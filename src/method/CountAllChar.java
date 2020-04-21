package method;

public class CountAllChar {
    public static void main(String[] args) {
        String sentence = "18 June - my birthday day";
        countAllChar(sentence);
    }

    public static void countAllChar(String a) {
        char[] count = a.toCharArray();
        int letter = 0;
        int number = 0;
        int space = 0;
        int other = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(count[i])) {
                letter++;
            } else if (Character.isDigit(count[i])) {
                number++;
            } else if (Character.isSpaceChar(count[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("letter= " + letter + "\n"
                + "number= " + number + "\n"
                + "space= " + space + "\n"
                + "other= " + other);
    }
}
