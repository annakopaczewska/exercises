package exBasicI;

public class LongestCommon {
    public static void main(String[] args) {

        System.out.println(findLongestCommon("Magdalena", "Helena"));
    }

    public static String findLongestCommon(String string1, String string2) {
        String result = "";
        for (int length = string1.length(); length > 0; length--) {
            int startIndex = 0;
            while (startIndex + length <= string1.length()) {
                String current = string1.substring(startIndex, startIndex + length);
                if (string2.contains(current)) {
                    result = current;
                    break;
                }
                startIndex++;
            }
            if (result.length() != 0) {
                break;
            }
        }
        return result;
    }
}