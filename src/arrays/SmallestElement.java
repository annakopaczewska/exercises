package arrays;

public class SmallestElement {
    public static void main(String[] args) {

        int[] array = new int[]{3, 7, 28, 70, 1};
        System.out.println(smallestElement(array));

    }

    public static int smallestElement(int[] array) {
        int i = 0;
        int smallest = Integer.MAX_VALUE;
        if (array == null) {
            return 0;
        } else {
            while (i < array.length) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
                i++;
            }
        }
        return smallest;
    }
}

