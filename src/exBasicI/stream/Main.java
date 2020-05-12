package exBasicI.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Maria", "Anna", "Maciej", "Paweł");

        Stream<String> stream1 = names.stream();
        Stream<String> streamFiltered = stream1.filter(n -> n.endsWith("a"));
        Set<String> filteredNames = streamFiltered.collect(Collectors.toSet());

        System.out.println(filteredNames);

    }
}
