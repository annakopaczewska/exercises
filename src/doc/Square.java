package doc;

public class Square {

    public static void main(String[] args) {
        printSquare(5);
    }

    public static void printSquare(int length) {
        for (int i = 0; i < length; i++) { // 1 2 3
            for (int j = 0; j < length; j++) { //  5 5
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
