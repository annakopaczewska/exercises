package doc;

public class Ex13 {
    public static void main(String[] args) {

        eNumber(11);
    }

    public static int eNumber(int number) {
        if (number % 2 ==0) {
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }
        if (number < 0) {
            System.out.println("Number is lower than 0");
        } else if (number == 0) {
            System.out.println("Number is equals 0");
        } else {
            System.out.println("Number is greater than 0");
        }
        return number;
    }
}


