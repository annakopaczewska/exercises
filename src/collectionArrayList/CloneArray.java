package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CloneArray {
    public static void main(String[] args) {
        ArrayList<String> sweets = new ArrayList<>();
        sweets.add("oreo");
        sweets.add("kinder");
        sweets.add("pieguski");
        System.out.println(" First array: " + sweets);

        ArrayList<String> doubleSweets = (ArrayList<String>) sweets.clone();
        System.out.println("Second array: " + doubleSweets);

        System.out.println("Empty array: " + sweets);

        System.out.println("Check if array is empty or not" + sweets.isEmpty());
        System.out.println("Array size: " + sweets.size());

        sweets.set(1, "ww");
        System.out.println("Array with replace:" + sweets);

        int allSweets = sweets.size();
        System.out.println("Using index of element: ");
        for (String sweet : sweets) {
            System.out.println(sweet);
        }
    }
}
