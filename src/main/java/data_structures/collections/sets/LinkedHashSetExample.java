package data_structures.collections.sets;

import java.util.LinkedHashSet;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 21:53
 * @project learn-java-w3school
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Stores unique items and keeps order as they were inserted
        LinkedHashSet<String> cars = new LinkedHashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // This item will be ignored.

        System.out.println(cars);
    }
}
