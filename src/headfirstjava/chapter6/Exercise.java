package headfirstjava.chapter6;

import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        showEverything(a);

        if (a.contains("tree")) {
            a.add("four");
        }
        a.remove(2);
        showEverything(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        showEverything(a);
        if (a.contains("two")) {
            a.add("2.2");
        }
        showEverything(a);
    }

    public static void showEverything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(i + "= " + arrayList.get(i));
        }
        System.out.println();
    }
}
