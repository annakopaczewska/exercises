package collectionArrayList;

import java.util.ArrayList;
import java.util.List;

public class Colors {
    public static void main(String[] args) {
        List<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Blue");
        color.add("Pink");
        color.add("Black");
        for (String element : color) {
            System.out.println(color);
        }
    }
}