package thinkjava;

import java.util.Arrays;

public class ex9_7 {
    public static void main(String[] args) {

        boolean words = isAnagram("listen", "silent");
        System.out.println(words);
    }

    public static boolean isAnagram(String string1, String string2) {
        char[] charStr1 = string1.toCharArray();
        char[] charStr2 = string2.toCharArray();
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        return Arrays.equals(charStr1, charStr2);
    }
}