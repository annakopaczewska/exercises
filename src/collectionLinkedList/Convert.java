package collectionLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Convert {
    public static void main(String[] args) {
        LinkedList<String> sweets = new LinkedList<String>();
        sweets.add("cookies");
        sweets.add("ice cream");
        sweets.add("snickers");
        sweets.add("lollipop");
        System.out.println(sweets);

        List<String> newList = new ArrayList<String>(sweets);
        System.out.println(newList);

//        sweets.removeAll(sweets);
//        System.out.println("Check if list is empty: " + sweets.isEmpty());

        sweets.set(2, "candy");
        System.out.println("New list: " + sweets);
    }
}
