package exercises;

import java.util.*;

/**
 * @author PhatNguyen
 * @created 20/09/2025 - 09:57
 * @project learn-java-w3school
 */
public class RemoveDuplicatesEx {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4));

        System.out.println(numbers);

        // Using Set
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);

        // Using Stream
        System.out.println(numbers.stream().distinct().toList());

        // Using algorithm
        List<Integer> uniqueList = new ArrayList<>();
        for (int number : numbers) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        System.out.println(uniqueList);
    }
}
