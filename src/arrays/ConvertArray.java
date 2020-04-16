package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArray {
    public static void main(String[] args) {

        String[] myArray = new String[]{"Anna", "Marta","Ola","Ala"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(myArray));
        System.out.println(list);
    }
}
