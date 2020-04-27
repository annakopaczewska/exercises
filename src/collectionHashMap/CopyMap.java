package collectionHashMap;

import java.util.HashMap;

public class CopyMap {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "white");
        myHashMap.put(2, "yellow");
        myHashMap.put(3, "pink");
        System.out.println("hashmap 1: " + myHashMap);

        HashMap<Integer, String> myHashMap2 = new HashMap<Integer, String>();
        myHashMap2.put(4,"black");
        myHashMap2.put(5,"brown");
        System.out.println("hashmap 2: " + myHashMap);

        myHashMap2.putAll(myHashMap);
        System.out.println("My hash map 2 now: " + myHashMap2);

        myHashMap2.clear();
        System.out.println("Empty map: " +myHashMap2);
    }
}
