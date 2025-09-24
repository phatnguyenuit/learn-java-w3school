package data_structures.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 21:27
 * @project learn-java-w3school
 */
public class SortingExample {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars);

        System.out.println("Sorting cars alphabetically");
        Collections.sort(cars);
        System.out.println(cars);

        System.out.println("Sorting cars alphabetically in reverse order");
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);
    }
}
