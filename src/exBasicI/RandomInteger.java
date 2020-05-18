package exBasicI;


public class RandomInteger {
    public static void main(String[] args) {
        System.out.println(randomNumb(25, 5));
    }

    public static int randomNumb(int max, int min) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
