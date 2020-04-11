package exBasicI;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public class InnerClass {

        public String toString() {

            return "Jestem tu " + x + " " + y;
        }
    }
}
