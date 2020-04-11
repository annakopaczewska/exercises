package exBasicI;

public class ex19 {
    public static void main(String[] args) {

        int number = 5;
        int result[] = new int[3];

        int i = 0;
        while (number > 0) {
            int reminder = number % 2;
            result [i] = reminder;
            number = number /2;
            i++;
        }
        for (int j = result.length - 1; j >= 0; j--) { // for (int e ; result.length)
            System.out.print(result[j]);
        }
    }
}
