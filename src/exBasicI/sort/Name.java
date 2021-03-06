package exBasicI.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Name {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Anna", "Zowak", 20));
        list.add(new Person("Kacper", "Kowal", 45));
        list.add(new Person("Stanisław", "Wojtala", 86));
        list.add(new Person("Anna", "Nara", 43));

//        Collections.sort(list, new PersonAgeComparator().reversed());
//        System.out.println(list);

        Comparator<Person> c = Comparator.comparingInt(Person::getAge);
        Comparator<Person> reversed = c.reversed();

        Collections.sort(list,reversed);
        System.out.println(list);
    }
}
