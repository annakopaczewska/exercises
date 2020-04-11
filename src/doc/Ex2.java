package doc;

public class Ex2 {
    public static void main(String[] args) {

       multiplicationTable(5);

    }

    public static void multiplicationTable(int num) {

        for (int i = 1; i < 10; i++) {
            int result = num * i;

            System.out.println(num + "*" + i + "=" + result);
        }
    }
}
