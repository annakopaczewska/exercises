package headfirstjava.chapter1;

public class MysteriousPool {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print("tyczny");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("tałek");
            }
            if (x < 1) {
                System.out.print("asz");
            }
            System.out.print(" ");
            x = x + 1;
        }
    }
}
