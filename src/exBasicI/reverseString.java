package exBasicI;

public class reverseString {

    public static void main(String[] args) {

        String string = "Words for Example";
        char[] array = string.toCharArray();
        int left=0;
        int right = array.length - 1;

        for (left = 0; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        for (char c : array)
            System.out.print(c);
        System.out.println();

    }
}

