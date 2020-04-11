package String_StringBuilder_StringBuffor;

public class TestWydajnosciowy {
    public static void main(String[] args) {
        String result = "";
        long start = System.currentTimeMillis();

        for(int i=0; i < 1_000_000; i++) {
            result += "a";
        }

        long end = System.currentTimeMillis();

        System.out.println("Czas trwania: " + (end-start) + "ms");
    }
}
