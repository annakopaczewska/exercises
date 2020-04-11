package exercisesPodypl;

public class CheckGroupNumbers {
    public static void main(String[] args) {

        int[] array = {11, 5, 13, 25, 11, 15};

        if ((array[0] == array[array.length - 2] && array[1] == array[array.length - 1])) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}