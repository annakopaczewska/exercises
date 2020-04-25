package collectionHashSet;

import java.util.HashSet;

public class ContentArray {
    public static void main(String[] args) {
        HashSet<String> hashList = new HashSet<String>();
        hashList.add("black");
        hashList.add("grey");
        hashList.add("red");
        hashList.add("pink");
        System.out.println("First list: " + hashList);

        HashSet<String> hashList2 = new HashSet<String>();
        hashList2.add("purple");
        hashList2.add("grey");
        hashList2.add("red");
        hashList2.add("white");
        System.out.println("Second list: " + hashList2);

        hashList.retainAll(hashList2);
        System.out.println(hashList);
    }
}
