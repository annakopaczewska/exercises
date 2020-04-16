package string;

public class LengthString {
    public static void main(String[] args) {

        String example = "Java exercises";
        lengthOfString(example);
    }

    public static void lengthOfString(String string) {
        int lenghth = string.length();
        System.out.println("Length is= " + lenghth);
    }
}
