package exercisesPodypl;

import java.util.Arrays;

public class LowerCase {
    public static void main(String[] args) {
        String string = "Kajak";
        String string2 = "ANNA";

        System.out.println(string.toLowerCase());

//        String[] words = string.split(" ");
//        System.out.println(words[words.length - 2]);
//
//        String lastChars = string.substring(string.length() - 3);
//        System.out.println(lastChars + lastChars + lastChars);
//
//        String firstLetter = string.substring(0,4);
//        System.out.println(firstLetter);

        System.out.println(string.substring(0, string.length() / 2));
    }
}