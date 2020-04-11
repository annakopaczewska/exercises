package doc;

public class Ex22 {
    public static void main(String[] args) {

        // 0, 1, 1, 2, 3, 5, 8, 13....
        int n = printFibonacci(11);
        System.out.println(n);
    }

    public static int printFibonacci(int nElement) {
        int fib0 = 0;
        int fib1 = 1;
        int result = 0;

        for (int i = 0; i < nElement - 1; i++) {
            result = fib0 + fib1;
            int temp = fib1;
            fib1 = result;
            fib0 = temp;
        }
        return result;
    }
}
