package difficult_tasks;

public class ex_5 {
    public static void main(String[] args) {
        int n = factorialNumb(4);
        System.out.println(n);
    }

    public static int factorialNumb(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
