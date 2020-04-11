package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInOrder(placeToVisit, "Sydney");
        addInOrder(placeToVisit, "Berlin");
        addInOrder(placeToVisit, "Poznań");
        addInOrder(placeToVisit, "Los Angeles");
        addInOrder(placeToVisit, "Maledivas");
        printList(placeToVisit);

        addInOrder(placeToVisit, "Krakow");
        addInOrder(placeToVisit, "Bali");
        printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {

        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
        } else {
        }
    }
}