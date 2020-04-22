package method;

public class PrintChars {
    public static void main(String[] args) {
        printChars('A', 'Z', 20);
    }

    public static void printChars(char ch1, char ch2, int n) {
        for (int temp = 1; ch1 <= ch2; temp++, ch1++) {
            System.out.print(ch1 + " ");
            if (temp % n == 0) System.out.println("");
        }
    }
}

