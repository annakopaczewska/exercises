package doc;

public class Ex1 {
    public static void main(String[] args) {

        int c = 125;
        int d = 24;

        int sum = add(c, d);
        int sub = sub(c, d);
        int mul = mul(c, d);
        int div = div(c, d);

        int rnums = rnums(c, d);

        System.out.println("Addition is= " + sum);
        System.out.println("Subtraction is= " + sub);
        System.out.println("Multiplication is= " + mul);
        System.out.println("Division is= " + div);
        System.out.println("Remainder is= " + rnums);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int mul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int div(int a, int b) {
        int div = a / b;
        return div;
    }

    public static int rnums(int a, int b) {
        int rnums = a % b;
        return rnums;
    }

}
