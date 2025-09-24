package exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author PhatNguyen
 * @created 20/09/2025 - 10:00
 * @project learn-java-w3school
 */
public class SortMapByValueEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Three", 3);
        map.put("One", 10);
        map.put("Two", 2);

        System.out.println(map);

        // Sort by value
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                    Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            // merge function in case of same key, different value
                            // in current case of map, it never happens
                            (oldValue, newValue) -> oldValue,
                            LinkedHashMap::new
                    )
                );

        System.out.println(sortedMap);
    }
}
