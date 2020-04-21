package method;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input length of side: ");
        double lengthSide = input.nextDouble();
        System.out.println("Area= " + area(lengthSide));
    }

    public static double area(double a){
        return (6*(a*a))/(4*Math.tan(Math.PI/6));
    }
}
