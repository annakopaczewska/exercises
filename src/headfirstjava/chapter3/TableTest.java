package headfirstjava.chapter3;

public class TableTest {
    public static void main(String[] args) {
        String[] string = new String[4];
        string[0] = "Bermudy";
        string[1] = "Fiji";
        string[2] = "Azory";
        string[3] = "Kozmuel";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int reference = 0;

        while (y < 4) {
            reference = index[y];
            System.out.println("island: " + string[reference]);
            y = y + 1;
        }
    }
}
