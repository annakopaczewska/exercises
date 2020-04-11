import java.util.ArrayList;
import java.util.Collections;

public class exampleee {

    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Poznań");
        list.add("Warszawa");
        list.add("Gdańsk");
        list.add("Szczecin ");

        System.out.println();
        for (String e : list) {
            System.out.println(e);
        }
        // chce posortować zgodnie z alfabetem - wysylam jako argument do odpowiedniej klasy Collections
        Collections.sort(list);
        for (String e : list) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println(Collections.min(list));

        Collections.shuffle(list);
        System.out.println();
        for(String e : list){
            System.out.println(e);
        }
    }
}