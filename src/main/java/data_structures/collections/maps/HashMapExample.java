package data_structures.collections.maps;

import java.util.HashMap;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 21:58
 * @project learn-java-w3school
 */
public class HashMapExample {
    public static void main(String[] args) {
        // Stores key-value pairs, duplicated keys will override the existing value
        HashMap<String, String> carMap = new HashMap<>();

        carMap.put("volvo", "Volvo");
        carMap.put("bmw", "bmw");
        carMap.put("bmw", "BMW"); // This will override the existing car bmw to BMW

        System.out.println("Size: " + carMap.size());
        System.out.println(carMap);

        System.out.println("Looping through car map by keys");
        for (String key: carMap.keySet()) {
            System.out.println(key + " = " + carMap.get(key));
        }

        System.out.println("Looping through car map by values");
        for (String car: carMap.values()) {
            System.out.println(car);
        }

        System.out.println("Getting car by key \"volvo\"");
        System.out.println(carMap.get("volvo"));

        System.out.println("Getting car by key \"mazda\"");
        System.out.println(carMap.get("mazda"));

        System.out.println("Allows to put null as a key");
        carMap.put(null, "OK");
        System.out.println(carMap);
    }
}
