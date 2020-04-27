package collectionHashMap;

import java.util.HashMap;

public class CopyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "pink");
        hashMap.put(2, "white");
        hashMap.put(3, "red");
        System.out.println("My hashMap: " + hashMap);

        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1 = (HashMap<Integer, String>) hashMap.clone();
        System.out.println("Cloned map: " + hashMap1);
    }
}
