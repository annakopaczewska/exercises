package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoArrays {
    public static void main(String[] args) {
        List<String> arrNumb = new ArrayList<String>();
        arrNumb.add("1");
        arrNumb.add("2");
        arrNumb.add("3");
        arrNumb.add("4");
        System.out.println(arrNumb);

        List<String> arrLetters = new ArrayList<String>();
        arrLetters.add("a");
        arrLetters.add("b");
        arrLetters.add("c");
        arrLetters.add("d");
        System.out.println(arrLetters);

        Collections.copy(arrNumb,arrLetters);
        System.out.println(arrNumb);
        System.out.println(arrLetters);

    }
}
