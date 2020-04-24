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

        myList.offerFirst("water");
        System.out.println(myList);

        LinkedList<String> newList = new LinkedList<String>();
        newList.add("fanta");
        newList.add("yerba");

        myList.addAll(1,newList);
        System.out.println(myList);

        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
    }
}
