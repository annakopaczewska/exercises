package method;

public class SumBinary {
    public static void main(String[] args) {

        System.out.println(addingBinary("1010", "10"));

    }

    public static String addingBinary(String binary1, String binary2) {
        int a = Integer.parseInt(String.valueOf(binary1), 2);
        int b = Integer.parseInt(String.valueOf(binary2), 2);
        int sum = a + b;
        return Integer.toBinaryString(sum);
    }
}
