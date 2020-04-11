package exBasicI;

public class ex {
    public static void main(String[] args) {
        int [] y = {4};
        y = zmien(y);
        System.out.println(y[0]);
    }
    public static int [] zmien(int[] x) {
        x = new int [1];
        x[0] += 20;
        System.out.println("metoda " + x[0]);
        return x;
    }
}
