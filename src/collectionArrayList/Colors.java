package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colors {
    public static void main(String[] args) {
        List<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Blue");
        color.add("Pink");
        color.add("Black");

        color.add(0,"Grey");
        color.add(3,"Yellow");
        System.out.println(color);

        String element = color.get(2);
        System.out.println("Color number three is: " + element);

        color.set(2, "White");
        System.out.println(color);

        System.out.println(color.contains("Red"));

        Collections.sort(color);
        System.out.println("List after sort: " + color);
    }
}