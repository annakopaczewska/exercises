package collectionHashMap;

import java.util.HashMap;

public class CheckEmpty {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "coffee");
        myHashMap.put(2, "tea");
        myHashMap.put(3, "pepsi");
        myHashMap.put(4, "mojito");

        boolean check = myHashMap.isEmpty();
        System.out.println("Empty hashMap? " + check);

        myHashMap.clear();
        check = myHashMap.isEmpty();
        System.out.println("Empty hashMap? " + check);
    }
}
