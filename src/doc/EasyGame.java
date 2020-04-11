package doc;

import java.util.Random;
import java.util.Scanner;

public class EasyGame {
    public static void main(String[] args) {
        int i = 0;
        int los;
        int odp;

        Random random = new Random();
        los = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("zgadnij liczbe 1-10 ");
        do {
            i++;
            System.out.println("podaj liczbe: ");
            odp = scanner.nextInt();
            if (odp > los) {
                System.out.println("Nietety nie zgadleś, moja liczba jest mniejsza " );
            }
            else if (odp < los) {
                System.out.println("Nie udalo sie. Wartosc jest wieksza ");
            }
        } while (odp != los);
        System.out.println("brawo odgadłes za " + i + " razem!" );
    }
}
