package collectionHashMap;

import java.util.HashMap;

public class TestKey {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap.put("tea", 1);
        myHashMap.put("coffee", 2);
        myHashMap.put("pepsi", 3);
        System.out.println("My hashMap: " + myHashMap);

        if (myHashMap.containsKey("tea")) {
            System.out.println("Yes, it exists! " + myHashMap.get("tea"));
        } else {
            System.out.println("No!");
        }

        if (myHashMap.containsKey("cola")) {
            System.out.println("Yes!" + myHashMap.get("cola"));
        } else {
            System.out.println("No!");
        }
    }
}
