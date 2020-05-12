package exBasicI.lambda;

import java.util.ArrayList;
import java.util.List;


public class Compare {
    public static void main(String[] args) {
        Compare compare = new Compare();
        compare.run();
    }

    private void run() {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Kacper");
        names.add("Stanisław");
        names.add("Ola");

        names.stream()
                .filter(s -> s.endsWith("a"))
                .map(name -> name + "!")
                .forEach(Compare::print);
//        names = filter(names, () -> false);
//        modifyAndDisplay(names, n -> n + " " + "!");
    }

    private static void print(String a) {
        System.out.println(a);
    }

//    private List<String> filter(List<String> input, Filter filter) {
//        List<String> resultList = new ArrayList<>();
//        for (String name : input) {
//            if (filter.filter()) {
//                resultList.add(name);
//            }
//        }
//        return resultList;
//    }
//
//    private void modifyAndDisplay(List<String> names, Modifier modifier) {
//        List<String> modifiedNames = new ArrayList<>();
//
//        for (String name : names) {
//            String modifiedName = modify(name, modifier);
//            modifiedNames.add(modifiedName);
//        }
//        System.out.println(modifiedNames);
//    }
//
//    private String modify(String string, Modifier modifier) {
//        return modifier.modify(string);
//    }
}
