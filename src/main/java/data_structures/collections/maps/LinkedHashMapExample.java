package data_structures.collections.maps;

import java.util.LinkedHashMap;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 23:15
 * @project learn-java-w3school
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Keeps entries order as they were inserted
        LinkedHashMap<String, String> carsMap = new LinkedHashMap<>();

        carsMap.put("bmw", "BMW");
        carsMap.put("volvo", "Volvo");
        carsMap.put("ford", "Ford");

        System.out.println(carsMap);
    }
}
