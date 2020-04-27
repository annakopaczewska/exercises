package collectionHashMap;

import java.util.HashMap;

public class CollectionView {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "pink");
        hashMap.put(2, "white");
        hashMap.put(3, "red");
        System.out.println("Collection view is: " + hashMap.values());
    }
}
