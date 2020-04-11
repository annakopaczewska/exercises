package doc;

import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println("Odd numbers: ");
        int[] array = {1, 2, 3, 4, 5};
        int[] result = getOddNumbers(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getOddNumbers(int[] array) {
        int[] oddNumbers = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers[j] = array[i];
                j++;
            }
        }

        int indexOffFirstZero = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            //żeby wyciąc zera, szukam indeks pierwszego 0, czyli 3
            //pierwsze zero jest na 3 indeksie, to znaczy że są 3 elementy przed zerem (o indeksach 0 1 2),
            // czyli nowa tablica ma mieć rozmiar 3
            if (oddNumbers[i] == 0) {
                indexOffFirstZero = i;
                break;
            }
        }

        int[] resultWithoutZeros = new int[indexOffFirstZero];
        // ostatnia pętla przepisuje indeksy 0,1,2 z tablicy [1, 3, 5, 0, 0] do nowej i wychodzi [1, 3, 5]
        for (int i = 0; i < indexOffFirstZero; i++) {
            resultWithoutZeros[i] = oddNumbers[i];
        }
        return resultWithoutZeros;
    }
}