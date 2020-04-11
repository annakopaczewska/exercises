package thinkjava;

public class ex7_4 {
    public static void main(String[] args) {

        System.out.println(factorial(4));

    }

    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

//    public static int factorial(int x) {
//        if (x == 0) {
//            return 1;
//        } else {
//            return x * factorial(x - 1);
//        }
//    }
}
