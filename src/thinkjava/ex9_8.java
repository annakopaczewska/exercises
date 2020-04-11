package thinkjava;

public class ex9_8 {
    public static void main(String[] args) {

        boolean word = canSpell("quijibo", "jib");
        System.out.println(word);
    }

    public static boolean canSpell(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.indexOf(str2.charAt(i)) != 1) {
                return false;
            } else {
                int charLocation = str1.indexOf(str2.charAt(i));
                str1 = str1.substring(0, charLocation)
                        + str1.substring(charLocation + 1, str1.length());
            }
        }
        return true;
    }
}
