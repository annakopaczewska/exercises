package exBasicI;

public class LucusNumbers {
    public static void main(String[] args) {
        System.out.print("First Lucas numbers: ");
        int n = 10;
        int n1 = 2, n2 = 1, n3;
        for (int i = 2; i < n; ++i) {
            n3 = n2;
            n2 += n1;
            n1 = n3;
            System.out.print(" " + n2);
        }
    }
}

