package collectionHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class AppendElements {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("black");
        hashSet.add("red");
        hashSet.add("white");

        System.out.println(hashSet);

        Iterator<String> hashSet2 = hashSet.iterator();
        for (String s : hashSet) {
            System.out.println(hashSet2);
        }
        System.out.println(hashSet.size());

        hashSet.removeAll(hashSet);
        System.out.println("Check array is empty or not: " + hashSet.isEmpty());
        System.out.println(hashSet);
    }
}
