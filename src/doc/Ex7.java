package doc;

public class Ex7 {
    public static void main(String[] args) {

        viewSumOddAndEvenNumber(0,0,12345);

    }

    public static void viewSumOddAndEvenNumber (int a,int b, int number) {
        while (number > 0) {
            int rest = number % 10;
            number /= 10;

            if (rest % 2 == 1) {
                a += rest;
            } else {
                b += rest;
            }
        }
        System.out.println("Odd is " + a);
        System.out.println("Even is " + b);
    }
}