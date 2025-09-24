package data_structures.collections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 21:35
 * @project learn-java-w3school
 */
public class HashSetExample {
    public static void main(String[] args) {
        // HashSet does not preserve items order. Just keeps items unique
        HashSet<String> cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // This item will be ignored.

        // [Volvo, Ford, BMW]
        System.out.println(cars);
        System.out.println("There are " + cars.size() + " car(s).");

        System.out.println("Looping through set of cars");
        for (String car: cars) {
            System.out.println(car);
        }

        System.out.println("Adding new car");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println("Checking if BMW car exists: " + cars.contains("BMW"));
        System.out.println("Checking if Honda car exists: " + cars.contains("Honda"));

        System.out.println("Removing BWM car out of the set");
        cars.remove("BMW");
        System.out.println(cars);

        System.out.println("Clearing all cars");
        cars.clear();
        System.out.println(cars);
    }
}
