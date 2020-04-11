package doc;

public class Ex23 {
    public static void main(String[] args) {
        int n = NWD(282, 78);
        System.out.println(n);
    }

    public static int NWD(int p, int q) {
        while (p != q) {
            if (p > q) {
                p -= q;
            } else {
                q -= p;
            }
        }
        return p;
    }
}



