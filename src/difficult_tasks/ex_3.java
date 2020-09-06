package difficult_tasks;

public class ex_3 {
    public static void main(String[] args) {

        String cipheredText = "ofaf";
        int n = 5;

        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] shiftedAlphabet = new char[alphabet.length];


        int j = 0;
        for (int i = n; i < alphabet.length; i++) {
            shiftedAlphabet[j] = alphabet[i];
            j++;
        }
        for (int i = 0; i < n; i++) {
            shiftedAlphabet[j] = alphabet[i];
            j++;
        }

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
        for (char c : array) {
            System.out.print(c + ", ");
        }
    }
}

