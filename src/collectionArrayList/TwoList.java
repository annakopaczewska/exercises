package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TwoList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("black");
        list1.add("pink");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("brown");
        list2.add("grey");
        list2.add("white");

        System.out.println(list1.equals(list2));

        Collections.swap(list2, 0, 1);
        System.out.println(list2);


        ArrayList<String> listAll = new ArrayList<String>();
        listAll.addAll(list1);
        listAll.addAll(list2);
        System.out.println(listAll);
    }
}
