package exBasicI.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleStream {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anna", "Maria", "Gienia", "Maciej", "Paweł");

        List<User> userList = names.stream()
                .filter(n -> n.endsWith("a"))
                .map(string -> new User(string, new Random().nextInt(70)))
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());

        System.out.println(userList);
    }

    static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
