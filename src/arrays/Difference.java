package arrays;

public class Difference {
    public static void main(String[] args) {

        int[] array = {5, 8, 20, 90, 18};
        difference(array);
    }

    public static void difference(int[] array) {
        int maxValue = array[0];
        int minValue = array[0];

        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            } else if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println("Differenece= " + (maxValue - minValue));
    }
}

