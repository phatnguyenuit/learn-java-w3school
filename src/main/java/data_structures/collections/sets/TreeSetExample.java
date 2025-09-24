package data_structures.collections.sets;

import java.util.TreeSet;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 21:44
 * @project learn-java-w3school
 */
public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet stores unique items in sorted order automatically.
        // Having the same methods as Set interface: size, add, remove, clear, contains.
        TreeSet<String> cars = new TreeSet<>();

        cars.add("Ford");
        cars.add("BWM");
        cars.add("Volvo");

        // [BWM, Ford, Volvo]
        System.out.println(cars);
    }
}
