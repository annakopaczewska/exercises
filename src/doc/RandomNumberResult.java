package doc;

public class RandomNumberResult {

    // pola klasy
    int number;
    int iterations;

    public RandomNumberResult(int number, int iterations) { // konstruktor, nazwa taka sama jak nazwa klasy

        this.number = number; // this oznacza ze odnosze sie do pól klasy a nie argumentu
        this.iterations = iterations;

    }
}
