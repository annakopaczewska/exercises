package difficult_tasks;

public class ex_6 {
    public static void main(String[] args) {
        int number = reverseNumber(5991);
        System.out.println(number);
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }
}
