package collectionLinkedList;

import java.util.LinkedList;
import java.util.List;

public class JoinTwoList {
    public static void main(String[] args) {

        LinkedList<String> firstList = new LinkedList<String>();
        firstList.add("red");
        firstList.add("purple");
        firstList.add("pink");

        LinkedList<String> secondList = new LinkedList<String>();
        secondList.add("black");
        secondList.add("white");
        secondList.add("grey");

        LinkedList<String> mainList = new LinkedList<String>();
        mainList.addAll(firstList);
        mainList.addAll(secondList);

        System.out.println("Join list: " + mainList);
    }
}
