package doc;

public class Ex18 {
    public static void main(String[] args) {

        String number = decimalToBinary(11);
        System.out.println(number);
    }

    private static String decimalToBinary(int number) {
        int num = 11;
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (number > 0) {

            int remainder = number % 2;
            result.append(remainder);
            number = number / 2;
            i++;
        }
        return result.reverse().toString();
    }
}
