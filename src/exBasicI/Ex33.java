package exBasicI;

public class Ex33 {
    public static void main(String[] args) {

        int number = sumOfNumber(25);
        System.out.println(number);
    }

    public static int sumOfNumber(int number){

        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;
    }
}
