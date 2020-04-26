package collectionHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Convert {
    public static void main(String[] args) {
        HashSet<String> hashList = new HashSet<String>();
        hashList.add("black");
        hashList.add("grey");
        hashList.add("red");
        hashList.add("pink");
        System.out.println(hashList);

        
        List<String> newList = new ArrayList<String>(hashList);
        System.out.println("ArrayList " + newList);
    }
}
