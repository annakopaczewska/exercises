package exercisesPodypl.chapter_1;


public class Ex1_1_BusinessCard {
    public static void main(String[] args) {

        String name = "Anna ";
        String surname = "Kopaczewska";
        String number = "722123586";
        String city = " Poznań";
        String line = number + city;


        for (int i = 0; i < line.length(); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println(name + surname);
        System.out.println(line);

        for (int i = 0; i < line.length(); i++) {
            System.out.print("*");
        }
    }
}
