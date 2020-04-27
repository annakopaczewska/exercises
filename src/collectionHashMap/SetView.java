package collectionHashMap;

import java.util.HashMap;
import java.util.Set;

public class SetView {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "citroen");
        myHashMap.put(2, "volkswagen");
        myHashMap.put(3, "bmw");
        myHashMap.put(4, "audi");

        Set set = myHashMap.entrySet();
        System.out.println("set values= " + set);
    }
}
