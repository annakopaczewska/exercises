package collectionArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TwoList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("black");
        list1.add("pink");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("red");
        list2.add("blacK");
        list2.add("pink");

        System.out.println(list1.equals(list2));
    }
}
