package data_structures.collections.maps;

import java.util.TreeMap;

/**
 * @author PhatNguyen
 * @created 01/09/2025 - 23:07
 * @project learn-java-w3school
 */
public class TreeMapExample {
    public static void main(String[] args) {
        // TreeMap stores key-value pairs sorted by keys
        TreeMap<String, String> carMap = new TreeMap<>();

        carMap.put("volvo", "Volvo");
        carMap.put("bmw", "BMW");
        carMap.put("ford", "Ford");

        System.out.println(carMap);
    }
}
