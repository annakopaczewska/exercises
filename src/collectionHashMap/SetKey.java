package collectionHashMap;

import java.util.HashMap;
import java.util.Set;

public class SetKey {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "lamp");
        myHashMap.put(2, "desk");
        myHashMap.put(3, "sofa");
        myHashMap.put(4, "chair");
        System.out.println("My hash map: " + myHashMap);

        Set keySet = myHashMap.keySet();
        System.out.println("Key set = " + keySet);
    }
}
