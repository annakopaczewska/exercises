package difficult_tasks;

public class ex_2 {
    public static void main(String[] args) {

        int number = FibonacciSequence(6);
        System.out.println(number);
    }

    public static int FibonacciSequence(int element) {
        int fib0 = 0;
        int fib1 = 1;
        int result = 0;

        for (int i = 0; i < element - 1; i++) {
            result = fib0 + fib1;
            int temporary = fib1;
            fib1 = result;
            fib0 = temporary;

        }
        return result;
    }
}
