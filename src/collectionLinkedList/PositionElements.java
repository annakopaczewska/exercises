package collectionLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class PositionElements {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("black");
        myList.add("red");
        myList.add("white");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Index: " + i + ", is " + myList.get(i));
        }

//        myList.remove(1);
//        System.out.println(myList);

        Collections.swap(myList,0,2);
        System.out.println(myList);

        Collections.shuffle(myList);
        System.out.println(myList);


    }
}
