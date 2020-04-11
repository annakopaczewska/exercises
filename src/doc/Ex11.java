package doc;

public class Ex11 {
    public static void main(String[] args) {

      printTriangle(3);
    }

    public static void printTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

