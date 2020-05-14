package exercisesPodypl.chapter_1;

public class Ex1_2_Triangle {
    public static void main(String[] args) {
        double a = 7;
        double h = 3;

        double triangle = a * h / 2;

        System.out.println(triangle);
        if (triangle > 7) {
            System.out.println("Big triangle");
        } else {
            System.out.println("Small triangle");
        }
    }
}