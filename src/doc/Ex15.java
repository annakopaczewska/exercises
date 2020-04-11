package doc;

public class Ex15 {
    public static void main(String[] args) {
        makeTriangleWithThisSides(5,6,8);
    }

    public static void makeTriangleWithThisSides(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
