package doc;

public class Ex27 {
    public static void main(String[] args) {

        int number = reverseNumber(1234);
        System.out.println(number);
    }

     public static int reverseNumber(int n) {
         int number = 1234;
         int reverse = 0;
         while (number != 0) {
             int digit = number % 10;
             reverse = reverse * 10 + digit;
             number = number / 10;
         }
         return reverse;
     }
}
