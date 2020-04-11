package thinkjava;

public class ex6_9 {

    public static void main(String[] args) {

        System.out.println(power(2.2, 2));

    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } if (n % 2 == 0){
            double temporary = power(x, n/2);
            return temporary*temporary;
        }
        else {
            return x * power(x, n - 1);
        }
    }
}
