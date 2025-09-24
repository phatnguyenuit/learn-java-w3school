package data_structures.collections.lists;

import java.util.LinkedList;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 21:21
 * @project learn-java-w3school
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars);

        // Linked list has several methods different from List interface
        cars.addFirst("Mazda");
        cars.addLast("Bentley");
        System.out.println(cars);

        System.out.println("The first car is " + cars.getFirst());
        System.out.println("The last car is " + cars.getLast());

        System.out.println("Removing the first car");
        cars.removeFirst();
        System.out.println(cars);

        System.out.println("Removing the last car");
        cars.removeLast();
        System.out.println(cars);
    }
}
