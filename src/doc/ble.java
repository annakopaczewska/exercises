package doc;

public class ble {

    public static void main(String[] args) {

        int numb[] = {4, 3, 2, 1};
        int minValue = numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < minValue) {
                minValue = numb[i];
            }
        }
        System.out.println(minValue);
    }
}
