package data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 15:22
 * @project learn-java-w3school
 */
public class Introduction {
    public static void main(String[] args) {
        // An ArrayList is a resizable array that can grow as needed. It keeps items in order.
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Roll Royce");
        cars.add("Audi");
        cars.add("KIA");
        cars.add("Audi"); // Array list allows duplicated items.

        System.out.println(cars);


        // HashSet is collection stores unique items.
        HashSet<String> hsCars = new HashSet<>();

        hsCars.add("BMW");
        hsCars.add("Audi");
        hsCars.add("KIA");
        hsCars.add("Audi"); // This item will be ignored as we had one already.

        System.out.println(hsCars);

        // HashMap stores key-value pairs
        HashMap<String, String> hmCars = new HashMap<>();
        hmCars.put("kia", "KIA");
        hmCars.put("bmw", "BMW");
        hmCars.put("audi", "Audi");
        hmCars.put("range_rover", "Range Rover");
        hmCars.put("audi", "Audi 2"); // This entry will override the previous key-value pair.

        System.out.println(hmCars);

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
