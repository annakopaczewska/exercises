package arrays;

public class TestArrays {
    public static void main(String[] args) {

        int[] array1 = {2, 4, 6, 8, 10, 12};
        int[] array2 = {1, 4, 6, 8, 10, 12};

        System.out.println(testArrays(array1, array2));
    }

    public static boolean testArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
