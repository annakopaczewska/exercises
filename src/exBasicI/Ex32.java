package exBasicI;

public class Ex32 {
    public static void main(String[] args) {
        compareTwoNumber(25, 39);
    }

    public static void compareTwoNumber(int a, int b) {

        if (a != b) {
            System.out.println(a + " != " + b);
        }
        if (a < b) {
            System.out.println(a + " < " + b);
        }
        if (a <= b) {
            System.out.println(a + " <= " + b);
        }
    }
}
