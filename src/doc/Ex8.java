package doc;

public class Ex8 {
    public static void main(String[] args) {

        findTheGreatestNumber(1, 2, 3);

    }

    public static void findTheGreatestNumber(int a,int b, int c) {
        if (a > b && a > c) {
            System.out.println("Greatest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Greatest number is " + b);
        } else if (c > a && c > b)
            System.out.println("Greatest number is " + c);
    }
}
