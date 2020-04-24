package collectionLinkedList;

import java.util.LinkedList;

public class RetrieveElement {
    public static void main(String[] args) {
        LinkedList<String> sweets = new LinkedList<String>();
        sweets.add("cookies");
        sweets.add("ice cream");
        sweets.add("snickers");
        sweets.add("lollipop");

        String retrieve = sweets.peekFirst();
        System.out.println("Retrieve element: " + retrieve);

        System.out.println("All sweets: " +sweets);
    }
}
