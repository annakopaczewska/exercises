package collectionLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AppendElement {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("black");
        myList.add("red");
        myList.add("white");

//        for (String a : myList) {
//            System.out.println(myList);
//    }
        Iterator iterator = myList.listIterator(1);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        // reverse order
        Iterator iterator1 = myList.descendingIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}