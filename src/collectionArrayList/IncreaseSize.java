package collectionArrayList;

import java.util.ArrayList;

public class IncreaseSize {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<String>(3);
        myArray.add("tea");
        myArray.add("coffee");
        myArray.add("pepsi");
        System.out.println(myArray);

        myArray.ensureCapacity(6);
        myArray.add("water");
        myArray.add("mojito");
        myArray.add("cola");
        System.out.println("New array: " + myArray);
    }
}
