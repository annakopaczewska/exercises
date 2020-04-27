package collectionHashMap;

import java.util.HashMap;

public class TestValue {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "tea");
        myHashMap.put(2, "coffee");
        myHashMap.put(3, "pepsi");
        System.out.println("My hashMap: " + myHashMap);

        if (myHashMap.containsValue("pepsi")) {
            System.out.println("Yes, it exists!");
        } else {
            System.out.println("No!");
        }
        if (myHashMap.containsKey("mojito")) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}

