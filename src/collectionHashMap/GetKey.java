package collectionHashMap;

import java.util.HashMap;

public class GetKey {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "lamp");
        myHashMap.put(2, "desk");
        myHashMap.put(3, "sofa");

        String value = myHashMap.get(3);
        System.out.println("Value for key number 3 is: " + value);
    }
}
