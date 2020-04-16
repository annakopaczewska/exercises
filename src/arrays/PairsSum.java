package arrays;

public class PairsSum {
    public static void main(String[] args) {

        int[] array = {4, 5, 2, 8, 1};
        pairsSum(array, 6);
    }
    
    public static void pairsSum(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == value) {
                    System.out.println(array[i] + "+" + array[j] + "= " + value);
                }
            }
        }
    }
}
