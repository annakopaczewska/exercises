package akademiakodu;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a radius: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area= " + area);
    }
}
