package collectionHashMap;

import java.util.HashMap;
import java.util.Map;

public class KeyAndValue {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "white");
        myHashMap.put(2, "yellow");
        myHashMap.put(3, "pink");
        myHashMap.put(4, "black");

        for (Map.Entry a : myHashMap.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
        System.out.println("Size of my hash map: " + myHashMap.size());
    }
}
