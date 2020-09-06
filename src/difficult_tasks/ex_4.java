package difficult_tasks;

public class ex_4 {
    public static void main(String[] args) {

        int n = NWD(200, 25);
        System.out.println(n);
    }

    public static int NWD(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        return a;
    }
}
