package doc;

public class Ex24 {
    public static void main(String[] args) {

        String cipheredText = "ofaf";
        int n = 5;

        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] shiftedAlphabet = new char[alphabet.length];
        // { f, g, h, i, j .... e}
        // shiftedAlph[0] = alphabet[4]
        // shiftedAlph[1] = alphabet[5]
        // shiftedAlph[2] = alphabet[6]
        int j = 0;

        for (int i = n; i < alphabet.length; i++) {
            shiftedAlphabet[j] = alphabet[i];
            j++;
        }
        // shiftedAlphabet[21] = alphabet[0]
        // shiftedAlphabet[22] = alphabet[1]
        // shiftedAlphabet[23] = alphabet[2]
        // shiftedAlphabet[24] = alphabet[3]
        // shiftedAlphabet[25] = alphabet[4]

        for (int i = 0; i < n; i++) {
            shiftedAlphabet[j] = alphabet[i];
            j++;
        }

        printArray(alphabet);
        System.out.println();
        printArray(shiftedAlphabet);

        System.out.println("----------------------------------------------------------");


        for (int i = 0; i < cipheredText.length(); i++) {

            char letter = cipheredText.charAt(i);

            for (int a = 0; a < shiftedAlphabet.length; a++) {
                if (letter == shiftedAlphabet[a]) {
                    System.out.print(alphabet[a]);
                }
            }
        }
    }
    private static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
