package exBasicI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compare {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Kacper");
        names.add("Stanisław");
        names.add("Ola");

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println(names);
    }
}
