package doc;

public class Ex3 {
    public static void main(String[] args) {
        // pi*r^2
        // 2 * pi * r

        double result = calculateArea(7.5);
        double result1 = calculatePerimeter(7.5);


        System.out.println("Area " + result);
        System.out.println("Perimeter " + result1);

    }

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculatePerimeter(double radius) {
        double result = 2 * Math.PI * radius;
        return result;
        // return 2 * Math.Pi *radius;
    }
}
