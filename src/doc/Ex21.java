package doc;

public class Ex21 {

    public static void main(String[] args) {

        int n = 15;
        // wywolanie funkcji z wartoscia argumentu 30
        printFizzBuzz(n);
    }

    // public static TYP_ZWRACANY NAZWA_FUNKCJI(TYP_ARGUMENT1_1 NAZWA_ARGUMENTU)
    public static void printFizzBuzz(int length) {

        for (int i = 1; i <= length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            if (i != length) {
                System.out.print(", ");
            }
        }
    }
}
