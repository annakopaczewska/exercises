package collectionLinkedList;

import java.util.LinkedList;

public class InsertElement {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("coffee");
        myList.add("tea");
        myList.add("pepsi");

        myList.add(1,"whisky");
        System.out.println(myList);

        myList.addFirst("cola");
        myList.addLast("mojito");
        System.out.println(myList);
    }
}
