package arrays;

public class FindIndex {
    public static void main(String[] args) {

        int[] array = {18, 99, 2, 4};
        System.out.println(findIndex(array, 4));
    }

    public static int findIndex(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            }
        }
        return a;
    }
}
