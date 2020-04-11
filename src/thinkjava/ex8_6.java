package thinkjava;

public class ex8_6 {
    public static void main(String[] args) {

    boolean result = areFactors(16, new int[] {8} );
        System.out.println(result);
    }

    public static boolean areFactors(int n, int[] values){
        for (int value : values) {
            if (n % value != 0){
                return false;
            }
        }
        return true;
    }
}
