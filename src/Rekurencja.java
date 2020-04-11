public class Rekurencja {
    public static void main(String[] args) {

        Rekurencja policz = new Rekurencja();
        int rekurencja = policz.policzSume(4);
        System.out.println("Suma: " + rekurencja);
    }

    public int policzSume(int liczba) {
        if (liczba <= 1) {
            return 1;
        } else {
            return liczba + policzSume(liczba - 1);
        }
    }
}
