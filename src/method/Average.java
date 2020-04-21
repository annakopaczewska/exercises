package method;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        System.out.println(average(x, y, z));
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
