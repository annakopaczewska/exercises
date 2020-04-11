package doc;

import java.util.Random;

public class Ex12 {

    public static void main(String[] args) {
        // Person person = new Person("Kacper", "Koza");
        String name = new String("Kacper");
        RandomNumberResult result = countRandomNumber();
        System.out.println("iterations = " + result.iterations);
        System.out.println("number = " + result.number);
    }

    public static RandomNumberResult countRandomNumber() {
        int iterations = 0;
        int number;
        Random rand = new Random();
        while (true) {
            iterations++;
            number = rand.nextInt(100);
            if (number % 5 == 3) {
                break;
            }
        }
        RandomNumberResult result = new RandomNumberResult(number, iterations); // result to obiekt, bo pochodzi od klasy
        return result;
    }
}


