package exBasicI;

import doc.RandomNumberResult;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(2, 5);

        Point.InnerClass result = point.new InnerClass();

        System.out.println(result);
    }
}
