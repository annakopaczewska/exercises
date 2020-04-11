package doc;

public class Fibonacci {
    public static void main(String[] args) {

        // f1 =0 , f1 =1, { 0,1,1,2,3,5,8,13...}
        int result = printFibonacci(6);
        System.out.println(result);
    }

    public static int printFibonacci (int number) {

        int fib0 = 0;
        int fib1 = 1;
        int result = 0;

        for (int i = 0; i < number - 1; i++) {
            result = fib0 + fib1;
            int temp = fib1;
            fib1 = result;
            fib0 = temp;
        }
        return result;
    }
}
