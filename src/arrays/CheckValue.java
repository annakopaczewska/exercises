package arrays;

public class CheckValue {

    public static void main(String[] args) {

        int[] array = new int[]{12,67,1995};
        System.out.println(checkContains(array,18));
    }

    public static boolean checkContains(int[] array, int value){
        for (int x : array) {
            if(value == x){
                return true;
            }
        }
        return false;
    }
}
