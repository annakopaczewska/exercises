package exBasicI;

public class factorial {
    public static void main(String[] args) {

        int number = 5;
        long factorial = 1;

        for (int a = 1; a <= number; a++) {
            factorial = factorial * a;
        }

//        int a =1;
//        while (a <= number) {
//            factorial = factorial * a;
//            a++;
//        }
        System.out.println("factorial of " + number + " is: " + factorial);
    }
}
