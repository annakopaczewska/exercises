package thinkjava;

public class ex8_8 {
    public static void main(String[] args) {

        int array = maxInRange(new int[] {1,2,3,4,5,6}, 1,3);
        System.out.println(array);

    }

    public static int maxInRange(int[] integers, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return integers[lowIndex];
        }
        int middle = (lowIndex + highIndex) / 2;

        return Math.max(
                maxInRange(integers, lowIndex, middle),
                maxInRange(integers, middle + 1, highIndex)
        );
    }

    public static int max(int[] integers)
    {
        return maxInRange(integers, 0, integers.length - 1);
    }
}
