package doc;

public class Ex26 {
    public static void main(String[] args) {

        boolean n = containsWord("acp", "Kacper");

        // "cpe" ma długość 3 liter, czyli index= 3 jest ostatnim indeksem który warto sprawdzić

        System.out.println(n);
    }

    public static boolean containsWord(String piceWord, String word) {

        boolean result = false;

        int iterations = word.length() - piceWord.length();
        for (int i = 0; i < iterations - 1; i++) {
            if (word.charAt(i) == piceWord.charAt(0)) {
                for (int j = 0; j < piceWord.length(); j++) { // zaczynamy od drugiej litery w "cpe" aż do końca

                    // tutaj sprawdzenia kolejnych liter itd
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}